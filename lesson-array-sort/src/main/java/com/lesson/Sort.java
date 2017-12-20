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
    
    	//回答
    	/*
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
    	*/
    	
    	//答え
    	quicksort(result, 0, result.length - 1);
    	
    }
    
    //答え
    private void quicksort(int[] result, int left, int right) {
    	
        int left_ = left;
        int right_ = right;
        int num = result[left_ + ((right_ - left_) / 2)];

        while (left_ <= right_) {
            while (result[left_] < num) {
                left_++;
            }
            while (result[right_] > num) {
                right_--;
            }
            if (left_ <= right_) {
                swap(result, left_, right_);
                left_++;
                right_--;
            }
        }
        if (left < right_) {
            quicksort(result, left, right_);
        }
        if (left_ < right) {
            quicksort(result, left_, right);
        }
    }

    private void swap(int[] result, int i, int j) {
        int temp = result[i];
        result[i] = result[j];
        result[j] = temp;
    }
}