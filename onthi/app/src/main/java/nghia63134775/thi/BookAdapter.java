package nghia63134775.thi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {


    public BookAdapter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_book, parent, false);
        }

        Book book = getItem(position);

        TextView bookNameTextView = convertView.findViewById(R.id.bookNameTextView);
        TextView pageCountTextView = convertView.findViewById(R.id.pageCountTextView);
        TextView priceTextView = convertView.findViewById(R.id.priceTextView);
        TextView descriptionTextView = convertView.findViewById(R.id.descriptionTextView);

        bookNameTextView.setText("Book Name: " + book.getBookName());
        pageCountTextView.setText("Page Count: " + book.getPage());
        priceTextView.setText("Price: " + book.getPrice());
        descriptionTextView.setText("Description: " + book.getDescription());

        return convertView;
    }
}
