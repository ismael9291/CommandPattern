

import java.util.List;

public class TurnOffAllDevices implements Command{

	List<Devices> devices;
	
	public TurnOffAllDevices(List<Devices> newDevices)
	{
		devices = newDevices;
	}
	
	public void execute() {

		for(Devices device: devices )
		{
			device.off();
		}
		
		
	}
	
	

}
