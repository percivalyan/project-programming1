package mahasiswa.main;

import mahasiswa.koneksi.KoneksiDatabase;
import mahasiswa.view.FrameMahasiswa;
import java.sql.Connection;
import java.sql.SQLException;
import mahasiswa.controller.MahasiswaController;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        FrameMahasiswa frameMahasiswa = new FrameMahasiswa();
        frameMahasiswa.setVisible(true);

        MahasiswaController mhsController = new MahasiswaController(frameMahasiswa);
        mhsController.tampilkanData();
    }
}
