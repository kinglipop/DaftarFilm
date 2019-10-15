/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan32.daftarfilm;

/**
 *
 * @author Firman Alfinas
 */
public class DaftarFilm {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println("Judul film : "+filmName);
        System.out.println("Genre film : "+filmGenre);
        System.out.println("Rating film : "+filmRating);
        System.out.println("Duration film : "+filmDuration+" menit");
        System.out.println("");
    }
}
