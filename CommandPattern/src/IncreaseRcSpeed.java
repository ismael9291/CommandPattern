

public class IncreaseRcSpeed implements Command{
	
	Devices device;
	
	public IncreaseRcSpeed (Devices newDevice)
	{
		device = newDevice;
	}

	public void execute() {

		device.up();
		
	}

}

