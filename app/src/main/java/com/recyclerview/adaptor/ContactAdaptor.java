package com.recyclerview.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.recyclerview.R;
import com.recyclerview.model.Contact;

import java.util.ArrayList;

public class ContactAdaptor extends RecyclerView.Adapter<ContactAdaptor.ViewHolder> {
    Context context;
    ArrayList<Contact> contactArrayList = new ArrayList<>();

    public ContactAdaptor(Context context, ArrayList<Contact> contactArrayList) {
        this.context = context;
        this.contactArrayList = contactArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_contact,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mtv_name.setText(contactArrayList.get(position).getName());
        holder.mtv_number.setText(contactArrayList.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return contactArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mtv_name, mtv_number;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mtv_name = itemView.findViewById(R.id.txt_name);
            mtv_number = itemView.findViewById(R.id.txt_number);
        }
    }
}