package com.aa.err;

import java.math.*;
import java.util.*;

public class Test {
	
	protected int AssetCnt;
	protected String[] strAsset;
	protected double[] orgWeigth;
	protected double[] maxWeigth;
	protected double[] minWeigth;
	protected double[] assetErr;
	protected double[] errSort;
	protected String flagReg;
	
	/* [MAIN] **********************************************************************************************************/
	public static void main(String[] args) throws Exception {
		String[] pStrAsset  = {"자산군1","자산군2","자산군3","자산군4","자산군5","자산군6"};
		double[] pAssetErr  = {0.04	 ,0.05   ,0.06	 ,0.07	 ,0.08	 ,0.09};
		double[] pWeightMin = {0	 ,0.10	 ,0.11	 ,0		 ,0.12	 ,0.13};
		double[] pWeightMax = {0.30	 ,0.20	 ,0.25	 ,0.20	 ,0.40	 ,0.30};
		
		Test target = new Test(pStrAsset, pAssetErr, pWeightMin, pWeightMax);
		Test target1 = new Test(pStrAsset, pAssetErr, pWeightMin, pWeightMax);
		
		if(target.getSum(target.minWeigth)>1) {
			System.out.println("비중 하한의 합이 100%가 넘었습니다. 재설정 부탁드립니다.");
		}else if(target.getSum(target.minWeigth)==1){
			double maxErr = target.getErrReturn(pWeightMin);
			System.out.println("최대 수익률: " + maxErr);
		}else {

			BigDecimal bigMaxErr = new BigDecimal(target.getMaxRtrn());
			BigDecimal bigMinErr = new BigDecimal(target1.getMinRtrn());
			
			float maxErr = bigMaxErr.floatValue();
			float minErr = bigMinErr.floatValue();
			
			System.out.println("최대 수익률: " + maxErr);
			System.out.println("최저 수익률 : " + minErr);
		}
		
	}
	
	public Test(String[] pAssets, double[] pErr, double[] pMin, double[] pMax) throws Exception {
		this.AssetCnt = pAssets.length;
		this.strAsset = pAssets.clone();
		this.assetErr  = pErr.clone();
		this.maxWeigth   = pMax.clone();
		this.minWeigth   = pMin.clone();
		this.errSort = pErr.clone();
		//디폴트 값 생성 ( 하한값 )
		this.orgWeigth = pMin.clone();
		Arrays.sort(errSort);
	}
	
	
	public double getMaxRtrn() {
		double result = 0.00;
		double weigthSum = 0.00;
		
		for(int i = AssetCnt-1 ; i >= 0 ; i--) {
			
			for(int j = 0 ; j < assetErr.length ; j++) {
				
				if(errSort[i] == assetErr[j]) {
					orgWeigth[i] = maxWeigth[j];
					weigthSum = getSum(orgWeigth);

					if( weigthSum == 1){
						//System.out.println("최대 수익률 비중을 찾았습니다");
						break;
					}else if( weigthSum > 1 ) {
						orgWeigth[i] -= (weigthSum-1);
						weigthSum = getSum(orgWeigth);
					}
					
				}
				
			}
			if ( weigthSum == 1)
			{
				result = getErrReturn(orgWeigth);
				break;
			}
			
		}
		
		
		return result;
	}
	
	public double getMinRtrn() {
		double result = 0.00;
		double weigthSum = 0.00;
		
		for(int i = 0 ; i < AssetCnt ; i++) {
			
			for(int j = 0 ; j < assetErr.length ; j++) {
				
				if(errSort[i] == assetErr[j]) {
					orgWeigth[i] = maxWeigth[j];
					weigthSum = getSum(orgWeigth);

					if( weigthSum == 1){
						//System.out.println("최저 수익률 비중을 찾았습니다.");
						break;
					}else if( weigthSum > 1 ) {
						orgWeigth[i] = (1-weigthSum);
						weigthSum = getSum(orgWeigth);
					}
					
				}
				
			}
			if ( weigthSum == 1)
			{
				result = getErrReturn(orgWeigth);
				break;
			}
			
		}
		return result;
	}

	public double getSum(double[] array) {
		double ret = 0.0d;
		
		for (int i=0; i<array.length; i++) {
			ret += Math.round(array[i]*100)/100.0;
		}
		return ret;
	}
	
	public double getErrReturn(double[] array) {
		double ret = 0.0d;
		
		for (int i=0; i<array.length; i++) {
			ret += Math.round(array[i]*100)/100.0 * Math.round(this.assetErr[i]*100)/100.0;
		}
		return ret;
	}
}
