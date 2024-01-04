public class Valid_Array_Declarations {
    public static void main(String[] args) {

        // 1-dimensional array different types of  declaration
        // 1-d array declaration

        int     []arr1;
        int     arr2[]; //    all of them are valid declarations
  //    []int   arr3;     not valid
        int[]   arr ;

        int[]   a,b;   // you can declare multiple arrays of same type like this  and later intialize them
        int c[],d[];
  //    int []e,[]f;   in  multiple array declaration square brackets after the declaration of 1st array is not possible like this

        // 1-d array size declaration

        arr  =  new int[4];   // size declaration valid like this
  //    int  [3]ar           cannot specify size like this
        a = new int[4];
        b = new int[5];


        // intialization

  int[] arr4 = {4,5,6,7,8};
  int[] arr5 = new int[] {9,10,11,12,13};    // declaration and intialization is valid like this
    /*    int[] arr6 ;
         arr6 = {1,3,4,5,6}          // not valid
         this type array declaration is  valid  but intialization should be  done in the same line of declaration .          */



        // 2-dimensional array

                        // 2-d array  declarations
        int[][]   arr7;
        int       [][]arr8;
        int       arr9[][];
        int       []arr10[];
        int[]     []arr11;
        int[]     arr12[];
  //    [][]int   arr13;       square braces in the starting of declaration is not valid
        int[][]   arr14,arr15;
        int       arr16[],arr17[];
  //    int[]     []arr18,[]arr19;   multiple array declarations is not possible like this
        int[]     []arr20,arr21[];   // declaration like this is allowed
 //     int[]     arr22[],[]arr22    // after the declaration of the 1st array ,
                                    //  immediately we should not use  square brackets "[]" for 2nd array declaration like this

        int[]     []arr23[],arr24[];  // here arr23 is 3-dimensional and arr24 is 3-dimensional ,
                                      // bracket before int is also given for next variable
        int       []arr25[],arr26[];   // here arr25 is 2-dimensional and arr26 is 2-dimensional
        int       []arr27,arr28;       // here arr27 and arr28 both are 1-dimensional arrays
        int       [][]arr29,arr30;      // here arr29 and arr30 both are 2-dimensional
        int       []arr31, arr32[][];   // here aar31 is one dimensional and arr32 is 3-dimensional








    }
}
