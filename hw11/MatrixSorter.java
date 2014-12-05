public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    //show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is ");
  		//	findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
   // sort(mat3d[2]);
   // show(mat3d);
   }
   public static int[][][] buildMat3d(){
    int o[][][]= new int [3][][];
    int r=0, p=0;
    for (int k=0; k<3; k++){
        r=3 + 2*k;
        o[k]=new int [r][];
        for (int h=0; h<r; h++){
            p=k+h+1;
            o[k][h]=new int [p];
            for (int q=0; q<p; q++){
             o[k][h][q]=(int)(Math.random()*100);
         }
        }
       
}return o;
}
    
}