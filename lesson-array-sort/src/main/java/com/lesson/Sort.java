package com.lesson;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        Sort sort = new Sort();

        int[] source = sort.generateRandomArray(Integer.parseInt(args[0]));
        int[] result = sort.sort(source);
        for (int n : result) {
            System.out.println(n);
        }
    }

    public int[] generateRandomArray(int n) {
        Random randomizer = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = randomizer.nextInt();
        }
        return array;
    }

    public int[] sort(int[] source) {
        int[] result = new int[source.length];
        System.arraycopy(source, 0, result, 0, source.length);

        doSort(result);
        return result;
    }

    private void doSort(int[] result) {
        // write the awesome code
    

    	int num;
    	int count = result.length;
    	
    	//後ろとの比較を要素数分繰り返す
    	for(int i=0; i<count; i++) {
    	    for(int j=0; j< count; j++) {
    	    	//最後じゃなければ比較
            	if ( j+1 < count) {
            		//次の値より大きければ入れ替え
            		if(result[j] > result[j+1]) {
            			//一時保存
            			num = result[j];
            			//入れ替え
	           			result[j] = result[j+1];
	           			//次のに入れる
	           			result[j+1] = num;
            		}
            	}	
    	    }
    	}

    		
    		

    	
    }
}