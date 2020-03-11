package android.latihan.resep_jawa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createKulinerData()
        rv_parts.layoutManager = LinearLayoutManager(this)
        rv_parts.setHasFixedSize(true)
        rv_parts.adapter = resepAdapter(testData, { phoneItem : ResepData -> phoneItemClicked(phoneItem) })
    }

    private fun phoneItemClicked(phoneItem : ResepData){
        val showDetailActivityIntent = Intent(this, PhoneDetailActivity::class.java)
        showDetailActivityIntent.putExtra("resepNama",phoneItem.foodName)
        showDetailActivityIntent.putExtra("foto", phoneItem.photo.toString())
        showDetailActivityIntent.putExtra("desc", phoneItem.resepDesc)
        showDetailActivityIntent.putExtra("region", phoneItem.region)
        startActivity(showDetailActivityIntent)
    }

    private fun createKulinerData() : List<ResepData>{
        val partList = ArrayList<ResepData>()
        partList.add(ResepData(R.drawable.liwet_solo,"Nasi Liwet", "Jawa Tengah", "Resep\n" +
                "Nasi liwet\n" +
                "450 g beras\n" +
                "4 lembar daun salam\n" +
                "3 batang serai\n" +
                "1 sdt Royco Kaldu Ayam\n" +
                "\n"+
                "Ayam suwir\n" +
                "1 ekor (600 g) ayam, buang kulitnya, potong 8 bagian\n" +
                "3 lembar daun salam\n" +
                "3 batang serai\n" +
                "2 cm lengkuas\n" +
                "1 sdt garam\n" +
                "2 sdt gula merah\n" +
                "150 ml santan cair\n" +
                "150 ml susu cair rendah lemak\n" +
                "200 ml air\n" +
                "\n"+
                "Ayam suwir (bumbu halus)\n" +
                "8 butir bawang merah\n" +
                "4 siung bawang putih\n" +
                "2 sdt ketumbar bubuk\n" +
                "4 butir kemiri\n" +
                "\n"+
                "Sayur labu siam\n" +
                "500 g labu siam, potong korek api\n" +
                "5 butir bawang merah, iris tipis\n" +
                "2 siung bawang putih, iris tipis\n" +
                "2 lembar daun salam\n" +
                "2 batang serai, memarkan\n" +
                "2 buah cabai merah\n" +
                "2 sdt Royco Kaldu Ayam\n" +
                "1 sdm gula merah\n" +
                "1 sdt merica putih\n" +
                "150 ml santan cair\n" +
                "150 ml susu cair rendah lemak\n" +
                "400 ml air\n" +
                "2 sdm minyak\n" +
                "\n" +
                "Cara Membuat\n" +
                "Pertama, cuci bersih beras yang telah dipersiapkan terlebih dahulu hingga bersih, lalu sisihkan.\n" +
                "Kedua, persiapkan bumbu-bumbu yang dibutuhkan seperti iris tipis bawang putih, memarkan serai, cuci bersih daun salam.\n" +
                "Ketiga, siapkan panci liwet (kastrol) dan masukkan beras yang sudah bersih ke dalam panci tersebut, lalu masukkan air hingga 2 ruas jari dari permukaan beras.\n" +
                "Keempat, Masukkan bumbu yang sudah dipersiapkan sebelumnya, tambahkan gula dan garam secukupnya, agar gurih bisa ditambahkan mentega.\n" +
                "Kelima, kukus beras yang sudah lengkap dengan bumbu di atas api kecil hingga air meresap, lalu aduk nasi hingga merata. Kemudian kukus kembali nasi hingga masak dengan durasi kurang lebih 30 menit.\n" +
                "Keenam, hidangkan nasi liwet dengan bahan pelengkap yaitu sambal, ikan asin, lalapan, tahu, tempe dan kerupuk."))
        partList.add(ResepData(R.drawable.brekecek_cilacap,"Brekecek", "Jawa Tengah","Bahan-bahan :  \n" +
                "\n" +
                "- 1/2 ikan laut (ikan ekor kuning)\n" +
                "- 1 batang sereh\n" +
                "- 1 tomat\n" +
                "- 2 lembar salam\n" +
                "- Segenggam kemangi\n" +
                "- secukupnya Garam\n" +
                "- secukupnya Gula\n" +
                "- secukupnya Penyedap rasa\n" +
                "- 2 gelas air/ lebih\n" +
                "- Minyak untuk menumis\n" +
                "\n" +
                "Bumbu halus:\n" +
                "- 1 ruas jahe\n" +
                "- 1 ruas kunyit\n" +
                "- 2 bawang putih\n" +
                "- 3 bawang merah\n" +
                "- 6 cabe merah\n" +
                "- 4 rawit merah\n" +
                "\n" +
                "Langkah- langkah: \n" +
                "\n" +
                "-Bersihkan bumbu dan ikan. Haluskan bawang putih, bawang merah, cabe, jahe, kunyit.\n" +
                "-Geprek sereh, iris lengkuas, iris tomat. Tumis bumbu halus hingga harum. Tambahkan sereh, salam, lengkuas. Tumis hingga harum. Tambahkan air. Masukan ikan.\n" +
                "-Didihkan ikan beri irisan tomat, garam, gula, penyedap rasa. Koreksi rasa. Masak hingga kuah menyusut, sebelum diangkat masukan kemangi. Sajikan selagi hangat."))
        partList.add(ResepData(R.drawable.gethuk_magelang,"Gethuk", "Jawa Tengah","Bahan : \n" +
                "\n" +
                "~  200 gram kelapa parut kasar, kukus selama 5 menit \n" +
                "~  1.250 gram singkong \n" +
                "~  125 gram gula pasir \n" +
                "~  30 gram margarine \n" +
                "~  4 sendok makan susu kental manis \n" +
                "~  1 sendok teh garam \n" +
                "~  1/4 sendok teh cokelat pasta \n" +
                "~  1/2 sendok teh esens vanili \n" +
                "~  4 tetes pewarna makanan warna merah muda . \n" +
                "\n" +
                "Bahan Taburan : \n" +
                "\n" +
                "~  150 gram kelapa parut kasar \n" +
                "~  1/4 sendok teh garam halus \n" +
                "~  1 lembar daun pandan . \n" +
                "Aduk semua bahan taburan dan kukus selam 15 menit \n" +
                "\n" +
                "Cara Membuat : \n" +
                "\n" +
                "1. Kukus Singkong sampai matang kemudian angkat selagi masih panas haluskan \n" +
                "    singkong dengan cara di tumbuk . \n" +
                "2. Tambahkan gula pasir,esens vanili, garam , kelapa parut dan margarin aduk \n" +
                "    hingga merata kemudian giling dengan gilingan getuk sampai lembut . \n" +
                "3. Bagi adonan menjadi 3 bagian, satu bagian di tetesi pewarna merah muda uleni \n" +
                "    hingga merata , satu bagian tambahkan cokelat pasta uleni rata , dan sisanya \n" +
                "    biarkan putih seadanya . \n" +
                "4. Ambil adonan getuk merah muda pipihkan adonan di atas loyang 18 X 18 cm yang\n" +
                "    sudah di alasi plastik setebal 1 cm dan padatkan, tambahkan  bahan getuk yang putih\n" +
                "    di atasnya dengan tebal yang sama dan yang terakhir pipihkan getuk yang cokelat \n" +
                "    di atasnya lalu padatkan .\n" +
                "5. Potong -potong getuk dengan lebar 1.1/2 cm dan taburi dengan kelapa parut "))
        partList.add(ResepData(R.drawable.lumpia_semarang,"Lumpia Semarang", "Jawa Tengah","Resep\n" +
                "1.Bahan-bahan/bumbu-bumbu:\n" +
                "~ 10 lembar kulit lumpia\n" +
                "~ 2 sendok makan tepung terigu dan 1 sendok makan air, dilarutkan untuk perekat\n" +
                "~ 500 ml minyak untuk menggoreng\n" +
                "2.Bahan isi:\n" +
                "~ 3 siung bawang putih, dicincang halus\n" +
                "~ 2 sendok teh ebi sangrai, dihaluskan\n" +
                "~ 100 gram udang kupas, dicincang kasar\n" +
                "~ 2 butir telur, dikocok lepas\n" +
                "~ 200 gram rebung kaleng, diiris korek api\n" +
                "~ 1/2 sendok makan saus tiram\n" +
                "~ 1 sendok makan kecap manis\n" +
                "~ 3/4 sendok teh garam\n" +
                "~ 1/4 sendok teh merica bubuk\n" +
                "~ 1/4 sendok teh gula pasir\n" +
                "~ 2 sendok makan minyak untuk menumis\n" +
                "3.Bahan saus:\n" +
                "~ 1 siung bawang putih, dihaluskan\n" +
                "~ 300 ml air\n" +
                "~ 50 gram gula merah, disisir halus\n" +
                "~ 25 gram gula pasir\n" +
                "~ 1 sendok makan tepung sagu dan 2 sendok teh air, dilarutkan untuk pengental\n" +
                "4.Pelengkap:\n" +
                "~ 10 buah cabai rawit hijau\n" +
                "~ 10 sendok teh acar mentimun\n" +
                "Cara Membuat\n" +
                "1.Isi, panaskan minyak. Tumis bawang putih dan ebi sampai harum. Tambahkan udang. Aduk sampai berubah warna.\n" +
                "2.Sisihkan di pinggir wajan. Masukkan telur. Aduk sampai berbutir. Tambahkan rebung. Aduk sampai layu.\n" +
                "3.Masukkan saus tiram, kecap manis, garam, merica bubuk, dan gula pasir. Aduk sampai meresap.\n" +
                "4.Ambil selembar kulit lumpia. Beri isi. Lipat dan gulung. Rekatkan dengan larutan tepung terigu. Goreng dalam minyak yang sudah dipanaskan sampai matang.\n" +
                "5.Saus, rebus bawang putih dan air sampai mendidih. Masukkan gula merah, dan gula pasir. Aduk sampai larut. Kentalkan dengan larutan tepung sagu. Aduk sampai meletup-letup.\n" +
                "Sajikan lumpia bersama saus dan pelengkap."))
        partList.add(ResepData(R.drawable.nas_grombyang,"Nasi Grombyang", "Jawa Tengah","Bahan :\n" +
                "1. Nasi putih hangat secukupnya.\n" +
                "2. 1/2 kg daging sapi.\n" +
                "3. 1/2 kg iga sapi.\n" +
                "4. 1 liter air bersih.\n" +
                "5. 2 lembar daun salam\n" +
                "6. 2 batang serai (geprak dan memarkan).\n" +
                "7. 2 sdm garam halus.\n" +
                "8. 2 sdm gula jawa (sisir halus).\n" +
                "9. 1 batang daun bawang (iris-iris tipis).\n" +
                "10. Minyak goreng untuk menumis (secukupnya).\n" +
                "11. Bawang goreng (secukupnya sebagai taburan).\n" +
                "\n" +
                "Bumbu Halus :\n" +
                "1. 50 gram kelapa parut (sangrai).\n" +
                "2. 7 siung bawang merah.\n" +
                "3. 4 siung bawang putih.\n" +
                "4. 2 buah kluwek (sedu lalu ambil sedikit airnya).\n" +
                "5. 3/4 sdm ketumbar.\n" +
                "6. 1/2 sdt merica bubuk.\n" +
                "7. 1 ruas jahe (kira-kira 1 cm).\n" +
                "8. 1 ruas kunyit bakar (kira-kira 1 cm).\n" +
                "\n" +
                "Cara membuatnya :\n" +
                "1. Mula-mula rebus daging dan sapi dengan air yang telah disiapkan tadi bersama dengan serai dan daun salam lalu masak hingga daging empuk. setelah empuk kemudian angkat iga dan daging sapinya lalu Didihkan kembali dengan api kecil.\n" +
                "2. Selanjutnya hangatkan minyak goreng kemudian tumis bumbu halus hingga wangi lalu tumisan tersebut masukkan kedalam rebusan daging. Tambahkan pula garam, gula merah serta daun bawang lalu masak kembali hingga matang sambil diaduk rata.\n" +
                "3. Terakhir, sajikan rebusan daging tadi kedalam sepiring nasi putih hangat."))
        return partList
    }
}
