package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// Create the 3d array. 
		// d1 = rows
		// d2 = columns
		// d3 = cell value and potentials.
		int[][][] cells = {
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				},
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
				}
		}; // end of initial cells[][][] creation
		
		//Define what cells go in what "boxes". A box is a 3x3 square of cells. There are 9, numbered left to right top to bottom.
		int[][] box1 = new int[][]{{0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}}; // Box1: Top left
		int[][] box2 = new int[][]{{0,3}, {0,4}, {0,5}, {1,3}, {1,4}, {1,5}, {2,3}, {2,4}, {2,5}}; // Box2: Top middle
		int[][] box3 = new int[][]{{0,6}, {0,7}, {0,8}, {1,6}, {1,7}, {1,8}, {2,6}, {2,7}, {2,8}}; // Box3: Top right
		int[][] box4 = new int[][]{{3,0}, {3,1}, {3,2}, {4,0}, {4,1}, {4,2}, {5,0}, {5,1}, {5,2}}; // Box4: Middle left
		int[][] box5 = new int[][]{{3,3}, {3,4}, {3,5}, {4,3}, {4,4}, {4,5}, {5,3}, {5,4}, {5,5}}; // Box5: Middle middle
		int[][] box6 = new int[][]{{3,6}, {3,7}, {3,8}, {4,6}, {4,7}, {4,8}, {5,6}, {5,7}, {5,8}}; // Box6: Middle right
		int[][] box7 = new int[][]{{6,0}, {6,1}, {6,2}, {7,0}, {7,1}, {7,2}, {8,0}, {8,1}, {8,2}}; // Box7: Bottom left
		int[][] box8 = new int[][]{{6,3}, {6,4}, {6,5}, {7,3}, {7,4}, {7,5}, {8,3}, {8,4}, {8,5}}; // Box8: Bottom middle
		int[][] box9 = new int[][]{{6,6}, {6,7}, {6,8}, {7,6}, {7,7}, {7,8}, {8,6}, {8,7}, {8,8}}; // Box9: Bottom right
		int[][][] boxes = new int[][][] {box1, box2, box3, box4, box5, box6, box7, box8, box9};
		int[][] box_keys = new int[9][9];
		
		// Fill out the box_keys array.
		//Loop rows \/
		for(int i=0; i<boxes.length; i++) {
			//Loop cols per row \/. Now we have cells.
			for(int c=0; c<boxes[i].length; c++) {
				//Loop boxes per cell \/
				for(int b=0; b<boxes.length; b++) {
					//Loop coords per box \/
					for(int j=0; j<boxes[b].length; j++) {
						if(boxes[b][j][0] == i && boxes[b][j][1] == c){
							box_keys[i][c] = b + 1;
							//System.out.println(box_keys[i][c]);
						}
					}
				}
			}
		}
		
		// Open/read file with input
		String puzzle = "";
		try {
		      File myObj = new File("input puzzle.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        puzzle += data;
		      }
		      //System.out.println(puzzle);
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		// Load puzzle into cell[][][]
		int character = 0;
		for (int r = 0; r<9; r++) {
			for (int c = 0; c<9; c++) {
				cells[r][c][0] = (puzzle.charAt(character))-48;
				character ++;
				//int num = cells[r][c][0] - 48; // Converting ASCII to int.
				//System.out.println(num);
			}
		} 
		
		String str = "";
		System.out.println("Unsolved sudoku:");
		for(int i=0; i<9; i++) {
			str = "";
			for(int j=0; j<9; j++) {
				str+=cells[i][j][0] + " ";
			}
			System.out.println(str);
		}
		
		
//------------------------------------------------------------------------------------------------------------//
		
		boolean skip_loop = false;
		boolean no_edits = false;
		boolean puzzle_is_finished = false;
		while (!puzzle_is_finished) {
			no_edits = true;
			skip_loop = false;
			
			// Determine potentials.
			for (int r = 0; r<9; r++) {
				for (int c = 0; c<9; c++) {
					for (int n = 1; n<10; n++) {
						//System.out.println(cells[r][c][n]);
						if(cells[r][c][0] == n){
						//	System.out.println(cells[r][c][0]);
							for (int i = 0; i<9; i++) {
								cells[i][c][n] = 0;
								
								cells[r][i][n] = 0;
								for(int j = 0; j<9; j++) {
									if(box_keys[i][j] == box_keys[r][c]) {
										cells[i][j][n] = 0;
										//System.out.println("cell "+(i+1)+":"+(j+1)+" is not "+n);
									}
								}
							}
						}//if	
						
					}
				}
			} 
			//if (no_edits == true){break;}
			
			// Check for single potentials and commit them when found.
			int cnt = 0;
			int val = 0;
			for (int r = 0; r<9; r++) {
				for (int c = 0; c<9; c++) {
					if (skip_loop == true) {continue;}
					cnt = 0;
					if(cells[r][c][0] == 0) {
						for (int n = 1; n<10; n++) {
							//System.out.println(cells[r][c][n]);
							//System.out.println(n);
							if(cells[r][c][n] != 0) {
								
								cnt++;
								val = n;
							}
							
						}
						//System.out.println(cnt);
						try {
							Thread.sleep(1);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if(cnt == 1){
							cells[r][c][0] = val;
							no_edits = false;
							//System.out.println("Edited cell "+(r+1)+":"+(c+1)+" to "+ val);
							//System.out.println(val);
							skip_loop = true;
						}
					}
				}
			} 
			if (skip_loop == true) {continue;}
		 		
			// Check for potentials that are alone in a R/C/B and commit them when found.
			cnt = 0;
			val = 0;
			for (int r = 0; r<9; r++) {
				for (int c = 0; c<9; c++) {
					
					if(cells[r][c][0] == 0) {
						for (int n = 1; n<10; n++) {
							if (skip_loop == true) {continue;}
							cnt = 0;
							val = n;
							if(cells[r][c][n] == 0) {
								//System.out.println("Checking cell "+(r+1)+":"+(c+1)+" for value "+ val);
								for (int i = 0; i<9; i++) {
									if(cells[i][c][n] != 0 || cells[i][c][0] == n || cells[r][i][n] != 0 || cells[r][i][0] == n) {
										cnt++;
									}
									for(int j = 0; j<9; j++) {
										if(box_keys[i][j] == box_keys[r][c]) {
											if(cells[i][j][n] != 0 || cells[i][j][0] == n) {
												cnt++;
											}
										}
									}
								}
							}
						
							//System.out.println(cnt);
							try {
								Thread.sleep(1);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if(cnt == 0){
								cells[r][c][0] = val;
								no_edits = false;
								//System.out.println("Edited cell "+(r+1)+":"+(c+1)+" to "+ val);
								skip_loop = true;
							}
						}
					}
				} 
			}
			if (skip_loop == true) {continue;}
			
			// Check for solved puzzle
			puzzle_is_finished = true;
			for (int r = 0; r<9; r++) {
				for (int c = 0; c<9; c++) {
					if(cells[r][c][0] == 0) {
						puzzle_is_finished = false;
					}
					
				}
			} 
			//System.out.println("Cycle");
			if (no_edits == true){
				//System.out.println("Failure to solve");
				break;
				}
		}
		
		// print solved puzzle
		str = "";
		System.out.println(" ");
		System.out.println("Solved sudoku:");
		for(int i=0; i<9; i++) {
			str = "";
			for(int j=0; j<9; j++) {
				str+=cells[i][j][0] + " ";
			}
			System.out.println(str);
		}
		
	} // End of main
	

}


/*int[][][] cells = {
				{
					{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				},
				{
					{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
				}
		};
*/