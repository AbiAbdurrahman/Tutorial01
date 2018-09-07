//Template Matrix :
//Tambahkan code sesuai kebutuhan

public class Matrix {
    private int size;
    private int matrix[][];

    /**
     * Constructor kelas Relasi
     * @param  n ordo Matriks
     */
    public Matrix(int size) {
   	 this.size = size;
   	 this.matrix = new int[size][size];

   	 for (int ii = 0; ii < size; ii++) {
   		 for (int jj = 0; jj < size; jj++) {
   			 matrix[ii][jj]= 0;
   		 }
   	 }
    }
	
	public void setSize(int size){
		this.size = size;
	}
	
	public int getSize(){
		return size;
	}

    /**
     * Method untuk mengisi nilai Matriks pada entri tertentu
     * @param baris nomor baris yang akan diisi nilai
     * @param kolom nomor kolom yang akan diisi nilai
     * @param nilai nilai yang akan diisikan ke (baris,kolom)
     */
    public void setEntriMatrix(int baris, int kolom, int nilai) {
   	 matrix[baris][kolom] = nilai;
    }
	
	/**
     * Method untuk mengakses nilai Matriks pada entri tertentu
     * @param baris nomor baris 
     * @param kolom nomor kolom 
     */
    public int getEntriMatrix(int baris, int kolom) {
   	 return matrix[baris][kolom];
    }
 
   	 /**
   	  * Method untuk print keseluruhan isi Matriks
   	  */
   	 public void print() {
   		 for (int ii = 0; ii < size; ii++) {
   			 for (int jj = 0; jj < size; jj++) {
   				 System.out.print(getEntriMatrix(ii,jj) + " ");
   			 }
   			 System.out.println();
   		 }
   	 }
	 
	 //Tambahkan method terkait operasi dasar pada matrix sesuai kebutuhan
}


