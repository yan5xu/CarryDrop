package demo;

import uchicago.src.sim.space.Object2DGrid;

public class CarryDropSpace {
	private Object2DGrid moneySpace;

public CarryDropSpace(int xSize, int ySize){
	moneySpace = new Object2DGrid(xSize,ySize);
	for(int i=0;i<xSize;i++){
		for(int j = 0;j<ySize; j++){
			//int currentValue=getMoneyAt(xSize,ySize);
			moneySpace.putObjectAt(i,j,new Integer(0));
		}
	}		
}
public int getMoneyAt(int x, int y){
	int i;
	if(moneySpace.getObjectAt(x, y)!=null){
		i=((Integer)moneySpace.getObjectAt(x,y)).intValue();
		
	}
	else{
		i=0;
	}
	return i;
}
public Object2DGrid getCurrentMoneySpace(){
	return moneySpace;
}



public void spreadMoney(int money){
	for (int i = 0;i<money;i++){
		int x=(int)(Math.random()*(moneySpace.getSizeX()));
		int y=(int)(Math.random()*(moneySpace.getSizeY()));
		
		int I;
		if (moneySpace.getObjectAt(x,y)!= null){
			I=((Integer)moneySpace.getObjectAt(x,y)).intValue();
		}
		else{
			I=0;
		}
		moneySpace.putObjectAt(x, y, new Integer(I+1));
	}
}
}