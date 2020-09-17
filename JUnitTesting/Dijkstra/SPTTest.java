import org.junit.jupiter.api.BeforeEach;                                                                                                 
import org.junit.jupiter.api.Test;                                                                                                       
                                                                                                                                         
import static org.junit.jupiter.api.Assertions.*;                                                                                        
                                                                                                                                         
class SPTTest {                                                                                                                          
                                                                                                                                         
    SPT spt;                                                                                                                             
                                                                                                                                         
    @BeforeEach                                                                                                                          
    public void setUp() {                                                                                                                
        spt = new SPT();                                                                                                                 
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testNullPointerException() {                                                                                             
        //spt.edges = new int[][] {};                                                                                                    
        assertThrows(NullPointerException.class, () -> spt.findSPT(null, 0));                                                            
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testInvalidSourceExceptionLessThan0() {                                                                                  
        int[][] edges = new int[2][2];                                                                                                   
        assertThrows(InvalidSourceException.class, () -> spt.findSPT(edges, -5));                                                        
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testInvalidSourceExceptionGreaterThanGraph() {                                                                           
        int[][] edges = new int[2][2];                                                                                                   
        assertThrows(InvalidSourceException.class, () -> spt.findSPT(edges, 3));                                                         
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testInvalidSourceEqualTo0(){                                                                                             
       int[][]edges = new int[2][2];                                                                                                     
       assertThrows(InvalidSourceException.class, () -> spt.findSPT(edges, 2) );                                                         
    }                                                                                                                                    
                                                                                                                                         
                                                                                                                                         
    @Test                                                                                                                                
    public void testInvalidGraph() {                                                                                                     
        int[][] edges = new int[3][2];                                                                                                   
        assertThrows(InvalidGraphException.class, () -> spt.findSPT(edges, 0));                                                          
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testLoopDetectedException() {                                                                                            
        int[][] edges = new int[][]{{2, 3, 1}, {9, -6, 5}, {3, 4, -2}};                                                                  
        assertThrows(LoopDetectedException.class, () -> spt.findSPT(edges, 0));                                                          
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testLoopDetectedException1() {                                                                                           
        int[][] edges = new int[][]{{-2, 3, 1}, {9, 6, 5}, {3, 4, -2}};                                                                  
        assertThrows(LoopDetectedException.class, () -> spt.findSPT(edges, 0));                                                          
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testLoopDetectedException2() {                                                                                           
        int[][] edges = new int[][]{{-2, 3, 1}, {9, -6, 5}, {3, 4, 2}};                                                                  
        assertThrows(LoopDetectedException.class, () -> spt.findSPT(edges, 0));                                                          
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testNoPathException() {                                                                                                  
        int[][] edges = new int[][]{{-1, 1, -2}, {-4, -3, -1}, {-1, -6, -7}};                                                            
        assertThrows(NoPathException.class, () -> spt.findSPT(edges, 0));                                                                
    }                                                                                                                                    
                                                                                                                                         
    @Test                                                                                                                                
    public void testNoPathException1() {                                                                                                 
       int[][] edges = new int[][]{{-1, 3, -2, -3, -4}, {-4, -1, 2, -1, -2}, {-1, -6, -7, 1, -1}, {-1, -1, -1, -1, -1}, {-1,-1,-1,-2,-1}};
       assertThrows(NoPathException.class, () -> spt.findSPT(edges, 0));                                                                 
    }                                                                                                                                    
                                                                                                                                         
                                                                                                                                         
    @Test                                                                                                                                
    public void testTwoPaths() {                                                                                                         
        int[] order = new int[3];                                                                                                        
        int [][] edges = new int[][]{{-1,1,2}, {-1,-1,1}, {-1,-1,-1}};                                                                   
        int[] list = new int[]{-1,0,0};                                                                                                  
                                                                                                                                         
        int[] list1 = new int[]{0,1,2};                                                                                                  
                                                                                                                                         
        try {                                                                                                                            
            order = spt.findSPT(edges, 0);                                                                                               
        }                                                                                                                                
        catch(Exception e){                                                                                                              
                                                                                                                                         
        }                                                                                                                                
                                                                                                                                         
        if(order.equals(list)) {                                                                                                         
            try {                                                                                                                        
                assertArrayEquals(list, order);                                                                                          
            }                                                                                                                            
            catch(Exception e){                                                                                                          
                                                                                                                                         
            }                                                                                                                            
                                                                                                                                         
        }                                                                                                                                
        else if(order.equals(list1)) {                                                                                                   
            try {                                                                                                                        
                assertArrayEquals(list1, order);                                                                                         
            } catch (Exception e) {                                                                                                      
                                                                                                                                         
            }                                                                                                                            
                                                                                                                                         
        }                                                                                                                                
                                                                                                                                         
    }                                                                                                                                    
                                                                                                                                         
                                                                                                                                         
    @Test                                                                                                                                
    public void testTwoPaths1(){                                                                                                         
        int [] order = new int[4];                                                                                                       
        int [][] edges = new int[][]{{-1,3,-2,-3,4}, {-4,-1,2,-1,-2}, {-1,-2,-1,1,-1}, {-1,-1,-1,-1,-1}, {-1,-1,-1,2,-1}};               
        int[] list = new int[]{-1,0,1,4,0};                                                                                              
        int[] list1 = new int[]{-1,0,1,2,0};                                                                                             
        try{                                                                                                                             
            order = spt.findSPT(edges, 0);                                                                                               
        }                                                                                                                                
        catch(Exception e){                                                                                                              
                                                                                                                                         
        }                                                                                                                                
                                                                                                                                         
        if(order.equals(list)) {                                                                                                         
            try {                                                                                                                        
                assertArrayEquals(list, order);                                                                                          
            }                                                                                                                            
            catch(Exception e){                                                                                                          
                                                                                                                                         
            }                                                                                                                            
        }                                                                                                                                
        else if(order.equals(list1)){                                                                                                    
            try{                                                                                                                         
                   assertArrayEquals(list1,order);                                                                                       
            }                                                                                                                            
            catch(Exception e){                                                                                                          
                                                                                                                                         
            }                                                                                                                            
        }                                                                                                                                
                                                                                                                                         
                                                                                                                                         
    }                                                                                                                                    
                                                                                                                                         
                                                                                                                                         
     @Test                                                                                                                               
     public void testOnePath() {                                                                                                         
         int[] order = new int[4];                                                                                                       
         int[][] edges = new int[][]{{-1, 3, -1, -2}, {-1, -1, 2, -1}, {-1, -1, -1, 1}, {-1, -1, -1, -1}};                               
         int[] list = new int[]{-1, 0, 1, 2};                                                                                            
                                                                                                                                         
         try {                                                                                                                           
             order = spt.findSPT(edges, 0);                                                                                              
         } catch (Exception e) {                                                                                                         
         }                                                                                                                               
                                                                                                                                         
                                                                                                                                         
         assertArrayEquals(list, order);                                                                                                 
                                                                                                                                         
                                                                                                                                         
     }                                                                                                                                   
                                                                                                                                         
}                                                                                                                                        
