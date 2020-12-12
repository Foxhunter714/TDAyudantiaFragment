package com.example.tdayudantiafragments.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tdayudantiafragments.BookAdapter;
import com.example.tdayudantiafragments.R;
import com.example.tdayudantiafragments.data.Book;
import com.example.tdayudantiafragments.data.DataSource;

import java.util.List;


public class ListBookFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RecyclerView recyclerView;
    private BookAdapter adapter;

    public ListBookFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ListBookFragment newInstance(String param1, String param2) {
        ListBookFragment fragment = new ListBookFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list_book, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //nombre del recycler
        recyclerView = view.findViewById(R.id.recyclerViewFragment);
        //Se seleccionar el LayoutManager que va a ocupar el recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        //Fijar el recylcer view con un tamaño fijo
        recyclerView.setHasFixedSize(true);

        //Lista de libros obtenidas
        final List<Book> bookList = new DataSource().getAllBooks();
        //Se genera la conexión entre el adapter y este listado
        adapter = new BookAdapter(bookList, getContext());
        //se genera la conexión final
        recyclerView.setAdapter(adapter);

        //evento onClick
        adapter.setOnItemClickListener(new BookAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                //Se crea una instancia de Book
                Book book = bookList.get(position);
                //Se llama al Fragment Manager
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                //Intercambio de fragmentos en pantalla
                final String tag = "detail";
                fragmentManager.beginTransaction().add(R.id.container, DetailFragment.newInstance(book.getName(), book.getImage(), book.getAuthor(), book.getYear()), tag).addToBackStack(tag).remove(fragmentManager.findFragmentByTag("listFragment")).commit();
            }
        });
    }
}