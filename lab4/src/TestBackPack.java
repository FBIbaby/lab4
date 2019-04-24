import static org.junit.Assert.*;
import org.junit.Test;

public class TestBackPack {
	
	@Test
	public void test(){
		int[][] t={{0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},
				  {0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}};
		int m = 10;
	    int n = 3;
	    int w[] = {3, 4, 5};
	    int p[] = {4, 5, 6};
	    int c[][] = BackPack.BackPack_Solution(m, n, w, p);
		for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= m; j++) {
	            assertEquals(c[i][j],t[i][j]);
	           }
	        }
	}
	
	@Test
	public void test1(){
		int[][] t={{0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},
				  {0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}};
		int m = 10;
	    int n = 3;
	    int w[] = {3, 4, 5};
	    int p[] = {4, 5, 6};
	    int c[][] = BackPack.BackPack_Solution(m, n, w, p);
		for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= m; j++) {
	            assertEquals(c[i][j],t[i][j]);
	           }
	        }
	}
}
