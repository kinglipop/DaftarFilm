/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan32.daftarfilm;

/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi tentang daftar film
 */
public class PBO11K10118904Latihan32DaftarFilm {
    public static DaftarFilm film = new DaftarFilm();
    public static void tmpl(String n,String g, double r, int d) {
        film.filmName = n;
        film.filmGenre = g;
        film.filmRating = r;
        film.filmDuration = d;
        film.nowPlaying();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=== Daftar Film Sedang Tayang ===");
        System.out.println("");
        tmpl("Venom","Action, Horror, Scifi",8.5,120);
        tmpl("Small Foot","Animation",9.0,96);
        tmpl("Crazy Rich Asian","Comedy",7.8,119);
        tmpl("Asih","Horror",6.0,100);
    }
    
}
