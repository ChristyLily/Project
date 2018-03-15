package com.example.christylilyfang.library;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class book_pic extends AppCompatActivity
{
    private List<Book> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books);
        initBooks();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initBooks() {
        Book book_0 = new Book(R.drawable.book0);
        fruitList.add(book_0);
        Book book_1 = new Book(R.drawable.book1);
        fruitList.add(book_1);
        Book book_2 = new Book(R.drawable.book2);
        fruitList.add(book_2);
        Book book_3 = new Book(R.drawable.book3);
        fruitList.add(book_3);
        Book book_4 = new Book(R.drawable.book4);
        fruitList.add(book_4);
        Book book_5 = new Book(R.drawable.book5);
        fruitList.add(book_5);
        Book book_6 = new Book(R.drawable.book6);
        fruitList.add(book_6);
        Book book_7 = new Book(R.drawable.book7);
        fruitList.add(book_7);
        Book book_8 = new Book(R.drawable.book8);
        fruitList.add(book_8);
        Book book_9 = new Book(R.drawable.book9);
        fruitList.add(book_9);
        Book book_11 = new Book(R.drawable.book11);
        fruitList.add(book_11);
        Book book_12 = new Book(R.drawable.book12);
        fruitList.add(book_12);
        Book book_13 = new Book(R.drawable.book13);
        fruitList.add(book_13);
        Book book_14 = new Book(R.drawable.book14);
        fruitList.add(book_14);
        Book book_15 = new Book(R.drawable.book15);
        fruitList.add(book_15);
        Book book_16 = new Book(R.drawable.book16);
        fruitList.add(book_16);
        Book book_17 = new Book(R.drawable.book17);
        fruitList.add(book_17);
        Book book_18 = new Book(R.drawable.book18);
        fruitList.add(book_18);
        Book book_19 = new Book(R.drawable.book19);
        fruitList.add(book_19);
        Book book_20 = new Book(R.drawable.book20);
        fruitList.add(book_20);
    }

    public class Book {
        private int imageId;

        public Book(int imageId) {
            this.imageId = imageId;
        }

        public int getImageId() {
            return imageId;
        }

    }

    public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.ViewHolder> {
        private List<Book> mFruitList;

        public class ViewHolder extends RecyclerView.ViewHolder {
            View fruitView;
            ImageView fruitImage;

            public ViewHolder(View view) {
                super(view);
                fruitView = view;
                fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            }
        }

        public FruitAdapter(List<Book> fruitList) {
            mFruitList = fruitList;
        }


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_album, parent, false);
            final  ViewHolder holder = new ViewHolder(view);
            holder.fruitView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    int position = holder.getAdapterPosition();
                    Book fruit = mFruitList.get(position);
                    Toast.makeText(v.getContext(),"you cliked view"+ "",Toast.LENGTH_LONG).show();
                }
            });
            holder.fruitImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position  = holder.getAdapterPosition();
                    Book fruit = mFruitList.get(position);
                    Toast.makeText(v.getContext(),"you clicked image"+"",Toast.LENGTH_LONG).show();
                }
            });
            return holder;
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Book book = mFruitList.get(position);
            holder.fruitImage.setImageResource(book.getImageId());
        }

        @Override
        public int getItemCount() {
            return mFruitList.size();
        }
    }
}

