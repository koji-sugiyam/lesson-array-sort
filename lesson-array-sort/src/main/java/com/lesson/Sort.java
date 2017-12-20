package com.lesson;

import java.util.Arrays;
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

        System.out.print(Arrays.toString(result)+"\r\n");
    	//答え
    	quicksort(result, 0, result.length - 1);
    	
    }
    
    //答え
    private void quicksort(int[] result, int left, int right) {
    	

    	//初期開始位置
        int left_ = left;
        
        //初期終わりの位置
        int right_ = right;
        
        //真ん中の値
        int num = result[left_ + ((right_ - left_) / 2)];

        System.out.println(String.format("%d",left_ + ((right_ - left_) / 2) ));
        		
        //開始位置が終わり位置よりも小さければ
        while (left_ <= right_) {
        	
        	//開始位置の値が、真ん中よりも小さければ
            while (result[left_] < num) {
            	//一つ進める
                left_++;
            }
            //終わりの位置の値が、真ん中よりも大きければ
            while (result[right_] > num) {
            	//一つ戻す
                right_--;
            }
            //開始位置と終わり位置関係が　<= なら 
            if (left_ <= right_) {
            	//入れ替える関数
                swap(result, left_, right_);
                //位置を進める
                left_++;
                //位置を戻す
                right_--;
            }
        }
        //終わり位置が、初期開始位置よりも大きい場合、再帰する（右から左まで比較し終えたか）
        if (left < right_) {
            quicksort(result, left, right_);
        }
        //開始位置が、初期終わり位置よりも小さい場合、再帰する（左から右まで比較し終えたか）
        if (left_ < right) {
            quicksort(result, left_, right);
        }
    }

    //入れ替え関数
    private void swap(int[] result, int i, int j) {
        int temp = result[i];
        result[i] = result[j];
        result[j] = temp;
        
        //確認用
        System.out.print(String.format("入れ替えた場所　%d %d\r\n",i,j));
        System.out.print(Arrays.toString(result)+"\r\n");
        
    }
}