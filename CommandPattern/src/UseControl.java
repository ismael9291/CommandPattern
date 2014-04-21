

import java.util.ArrayList;
import java.util.List;

public class UseControl {
	
	public static void main(String[] args){
		
		Devices newDevice = RcRemote.getDevice();
		
		TurnRcOn onCommand = new TurnRcOn(newDevice);
		
		DeviceButton onPress = new DeviceButton (onCommand);
		
		onPress.press();
		
		
		
		
		TurnRcOff offCommand = new TurnRcOff(newDevice);
		
		onPress = new DeviceButton (offCommand);
		
		onPress.press();
		
		
		
		
		IncreaseRcSpeed increaseCommand = new IncreaseRcSpeed(newDevice);
		
		onPress = new DeviceButton (increaseCommand);
		
		onPress.press();
		onPress.press();

		
		//Multiple devices
		
		
		RcCar car = new RcCar();
		
		RcBoat boat = new RcBoat();
		
		List <Devices> allDevices = new ArrayList <Devices>();
		
		allDevices.add(car);
		allDevices.add(boat);
		
		TurnOffAllDevices turnOffEverything = new TurnOffAllDevices(allDevices);
		DeviceButton turnAllOff = new DeviceButton (turnOffEverything);
		
		turnAllOff.press();
		
		
		
	}
	

}
