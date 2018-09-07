//Template relasi :
//Tambahkan code sesuai kebutuhan

public class Relasi {
    private Matrix matrix;

    /**
     * Constructor kelas Relasi
     * @param  size ordo Matriks
     */
    public Relasi(int size) {
   	 this.matrix = new Matrix(size);
    }
	
	public Matrix getMatrix(){
		return matrix;
	}

    /**
     * Method untuk mengecek sifat isRefleksif Matriks
     * jika semua diagonal nilainya 1 ubah isRefleksif menjadi true
     */
    public boolean isRefleksif() {
   	 // to do
      boolean refleksif = true;
      for (int i = 0; i < this.getMatrix().getSize(); i++) {
        if (this.getMatrix().getEntriMatrix(i,i) == 0) {
          refleksif = false;
        }
      }
      return refleksif;
    }

    /**
     * Method untuk mengecek sifat IsIrrefleksif Matriks
     * jika semua diagonal nilainya 0 isIrrefleksif menjadi true
     */
    public boolean isIrrefleksif() {
   	 // to do
      boolean irrefleksif = true;
      for (int i = 0; i < this.getMatrix().getSize(); i++) {
        if (this.getMatrix().getEntriMatrix(i,i) == 1) {
          irrefleksif = false;
        }
      }
      return irrefleksif;
    }

    /**
     * Method untuk mengecek sifat simetri Matriks
     * jika ada satu saja nilai matriks yang berlawanan dengan nilai diagonal segitiga atas/bawahnya, ubah isSimetri menjadi false
     */
    public boolean isSimetri() {
   	  //to do
      boolean simetri = true;
      for (int i = 0; i < this.getMatrix().getSize(); i++) {
        if (simetri == false) {
          break;
        }
        for (int j = i+1; j < this.getMatrix().getSize(); j++) {
          if (this.getMatrix().getEntriMatrix(i,j) != this.getMatrix().getEntriMatrix(j,i)) {
            simetri = false;
            break;
          }
        }
      }
	    return simetri;
    }

    /**
     * Method untuk mengecek sifat antisimetri Matriks
     * jika ada satu saja nilai matrika yang diagonal segitiga atas/bawahnya sama-sama 1, ubah isAntisimetri menjadi false
     */
    public boolean isAntisimetri() {
   	 // to do
     boolean antisimetri = true;
      for (int i = 0; i < this.getMatrix().getSize(); i++) {
        if (antisimetri == false) {
          break;
        }
        for (int j = i+1; j < this.getMatrix().getSize(); j++) {
          if ((this.getMatrix().getEntriMatrix(i,j) == this.getMatrix().getEntriMatrix(j,i)) && ((this.getMatrix().getEntriMatrix(i,j) != 0) && (this.getMatrix().getEntriMatrix(j,i) != 0))) {
            antisimetri = false;
            break;
          }
        }
      }
      return antisimetri;
    }

    /**
     * Method untuk mengecek sifat asimetri Matriks
     * jika benar ubah isAsimetri menjadi true
     */
    public boolean isAsimetri() {
   	 //to do
     boolean syarat1 = true;
	   for (int i = 0; i < this.getMatrix().getSize(); i++) {
        for (int j = i+1; j < this.getMatrix().getSize(); j++) {
          if (this.getMatrix().getEntriMatrix(i,j) == 1) {
            if (this.getMatrix().getEntriMatrix(j,i) == 1) {
              syarat1 = false;
            }
          }
        }
      }
      boolean syarat2 = this.isIrrefleksif();
      if (syarat1 && syarat2) {
        return true;
      } else {
        return false;
      }
    }

    /**
     * Method untuk mengecek sifat transitif Matriks
     * jika benar ubah isTransitif menjadi true
     */
    public boolean isTransitif() {
   	   // to do
	     boolean transitifCozItIs = false;
       for (int i = 0; i < this.getMatrix().getSize(); i++) {
         for (int j = 0; j < this.getMatrix().getSize(); j++) {
           if (i == j) {
             continue;
           } else {
              if (this.getMatrix().getEntriMatrix(i,j) == 1) {
                for (int k = 0; k < this.getMatrix().getSize(); k++) {
                  if ((this.getMatrix().getEntriMatrix(j,k) == 1) && (this.getMatrix().getEntriMatrix(i,k) == 1)) {
                    transitifCozItIs = true;
                    break;
                  }
                }
              }
           }
         }
       }
       if (transitifCozItIs || this.isRefleksif()) {
         return true;
       } else return false;
    }
    
    /**
     * Method untuk mengubah Matriks menjadi bersifat penutup refleksif
     */
    public void changeToRefleksif() {
   	  // to do
      Matrix newMatrix = new Matrix(this.getMatrix().getSize());
      for (int i = 0; i < newMatrix.getSize(); i++) {
        for (int j = 0; j < newMatrix.getSize(); j++) {
          if (i == j) {
            newMatrix.setEntriMatrix(i,j,1);
          } else {
            newMatrix.setEntriMatrix(i,j,this.getMatrix().getEntriMatrix(i,j));
          }
        }
      }
      newMatrix.print();
    }
    
    /**
     *  Method untuk mengubah Matriks menjadi bersifat penutup transitif
     */
    public void changeToTransitif() {
   	 // to do
      Matrix newMatrix = new Matrix(this.getMatrix().getSize());
      for (int i = 0; i < newMatrix.getSize(); i++) {
        for (int j = 0; j < newMatrix.getSize(); j++) {
            newMatrix.setEntriMatrix(i,j,this.getMatrix().getEntriMatrix(i,j));
            if (newMatrix.getEntriMatrix(i,j) == 1) {
              for (int k = 0; k < this.getMatrix().getSize(); k++) {
                if ((this.getMatrix().getEntriMatrix(j,k) == 1)) {
                  newMatrix.setEntriMatrix(i,k,1);
                } else if ((this.getMatrix().getEntriMatrix(i,k) == 1)) {
                  newMatrix.setEntriMatrix(j,k,1);
                } else continue;
              }
            } else continue;        
        }
      }
      newMatrix.print();
    }

    /**
     *  Method untuk mengubah Matriks menjadi bersifat penutup Simetri
     */
    public void changeToSimetri() {
   	 // to do
      Matrix newMatrix = new Matrix(this.getMatrix().getSize());
      for (int i = 0; i < newMatrix.getSize(); i++) {
          newMatrix.setEntriMatrix(i,i,this.getMatrix().getEntriMatrix(i,i));
      }
      for (int j = 0; j < newMatrix.getSize(); j++) {
        for (int k = j+1; k < newMatrix.getSize(); k++) {
          newMatrix.setEntriMatrix(j,k,this.getMatrix().getEntriMatrix(k,j));
          newMatrix.setEntriMatrix(k,j,newMatrix.getEntriMatrix(j,k));
        }
      }
      newMatrix.print();
    }
    
   	 /**
   	  * Method untuk print isi Matriks
   	  */
   	 public void print() {
   		 matrix.print();
   	 }

     /**
      * Kodingan untuk anamedsos
      */
     public void dfs(Matrix matrix, int vertex) {
        public boolean isVisited;

     }
}


