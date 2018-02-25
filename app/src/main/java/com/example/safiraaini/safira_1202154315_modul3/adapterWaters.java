package com.example.safiraaini.safira_1202154315_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class adapterWaters extends RecyclerView.Adapter<adapterWaters.ViewHolder> {

    private ArrayList<String> arrayListJudul, arrayListDeskripsi;
    private ArrayList<Integer> arrayListGambar;

    adapterWaters(ArrayList<String> arrayListJudul, ArrayList<String> arrayListDeskripsi, ArrayList<Integer> arrayListGambar){
        this.arrayListJudul = arrayListJudul;
        this.arrayListDeskripsi = arrayListDeskripsi;
        this.arrayListGambar = arrayListGambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Judul, Deskripsi;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Judul = itemView.findViewById(R.id.judul);
            Deskripsi = itemView.findViewById(R.id.deskripsi);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.list_waters);
        }
    }

    @Override
    public adapterWaters.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adapter_waters, parent,false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }
    @Override
    public void onBindViewHolder(adapterWaters.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String judul = arrayListJudul.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan sebelumnya
        final String desc = arrayListDeskripsi.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan sebelumnya
        final Integer gambar = arrayListGambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan sebelumnya
        holder.Judul.setText(judul);// Mengambil text sesuai posisi yang telah ditentukan sebelumnya
        holder.Deskripsi.setText(desc); // Mengambil text sesuai posisi yang telah ditentukan
        holder.Gambar.setImageResource(gambar); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Action Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), watersDetail.class);
                String descs1 = "Ades (sebelumnya pernah disebut AdeS) adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi. Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang.";
                String descs2 = "Amidis adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.";
                String descs3 ="Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.";
                String descs4="Cleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride.";
                String descs5="Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986.";
                String descs6="Equil mungkin masih asing di telinga kebanyakan masyarakat Indonesia.  Namun merk air mineral murni ini sudah cukup dikenal kalangan menengah atas dan ekspatriat. Equil kerap hadir di meja restoran fine dining, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet.";
                String descs7="Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman";
                String descs8="Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari.";
                String descs9="Nestle menjadi modal kuat bagi produk air mineral mereka, Nestle Pure Life. Ketimbang jor-joran di kampanye marketing, Pure Life pun lebih nyaman memperkuat channel distribution. Hasilnya Pure Life melesat menjadi pemain besar Air Minum Dalam Kemasan dalam waktu singkat.";
                String descs10="Pristine 8+ merupakan Air minum Alkaline dengan kandungan pH 8+ (Melebihi 8) yang memberikan manfaat detoxifikasi bagi tubuh kita.";
                String descs11="VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta.";

                switch (position){
                    case 0:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs1);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs2);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs3);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs4);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs5);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs6);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs7);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs8);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("judul", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs9);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs10);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("deskripsi", arrayListDeskripsi.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("descs", descs11);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    //mengembalikan arrayList
    @Override
    public int getItemCount() {
        return arrayListJudul.size();
    }
}


