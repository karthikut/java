package com.xworkz.photography.dao;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.xworkz.photography.dto.CameraDTO;

public class CameraDAOImplementation  extends CameraDAO {
	
	CameraDTO[] cameraArray = super.getCameraDTOs();
	int creater=0;

	public CameraDAOImplementation() {
		System.out.println("CREATE" + getClass().getSimpleName());
	}

	

	@Override
	public boolean save(CameraDTO cameraDTO) {
		if (cameraDTO==null) {
		System.err.println("the dto is null and cant be added");
		return false;
	}
		if(this.creater<this.cameraArray.length) {
			this.cameraArray[this.creater]= cameraDTO;
			System.out.println("the dto is added to index @ " + this.creater);
			this.creater++;
			return true;
			
		}else {
			
	System.err.println("dto out of bound");
		}
		return false;
		
	}

	@Override
	public CameraDTO findById(int cameraId) {
		if (cameraId<=0) {
			System.out.println("the id is null cannot be found");
		}
		return null;
	}
	
	
	
	
	 for  (int index=0; index<cameraArray.length;index++){
		 if (cameraArray[index]!=null && cameraArray[index].getCameraId()==cameraId) {
			 System.out.println("the id is found @ dto index " + index);
			 return cameraArray[index];
		 }
		 
	System.out.println("ithe id is not found");
		
	
	
	 
	 return null;
}

	


@Override
	public CameraDTO findByMaxCost() {
		int maxCost=0;
		int maxCostIndex=0;
		
		for (int i = 0; i < cameraArray.length; i++) {
			if(cameraArray[i]!=null) {
				int cost = cameraArray[i].getCost();
				if (cost>maxCost) 
					maxCost= cost;
				maxCostIndex=i;
				
	
		}
		}
		System.out.println("the max cost of camera is" + maxCost+ maxCostIndex );
		return cameraArray[maxCostIndex];
	}
	
	public CameraDTO findByMinCost() {
		int minCost=cameraArray[0].getCost();
		int minCostIndex=0;
		
		for (int i = 0; i < cameraArray.length; i++) {
			if(cameraArray[i]!=null) {
				int cost = cameraArray[i].getCost();
				if (cost>minCost) 
					minCost= cost;
				minCostIndex=i;
				
	
		}
		}
		System.out.println("the max cost of camera is" + minCost+ minCostIndex );
		return cameraArray[minCostIndex];
	}

	}


