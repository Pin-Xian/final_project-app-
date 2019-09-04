package com.example.news_part1;

        import android.app.Activity;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;


    public class CustomListAdapter extends ArrayAdapter {
        private final Activity context;
        private final String[] item_name;
        private final Integer[] image_id;
        TextView mTxvWord01, mTxvWord02;
        ImageView mImgLogo;

        public CustomListAdapter(Activity context, String[] item_name, Integer[] image_id) {
            super(context, R.layout.items, item_name);
            this.context = context;
            this.item_name = item_name;
            this.image_id = image_id;
        }


        @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.items, null,true);

        mImgLogo = (ImageView) rowView.findViewById(R.id.picture);
        mTxvWord01 = (TextView) rowView.findViewById(R.id.title);
        //mTxvWord02 = (TextView) rowView.findViewById(R.id.article);

        mImgLogo.setImageResource(image_id[position]);
        mTxvWord01.setText(item_name[position]);
        return rowView;
    };

}
