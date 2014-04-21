

public class DecreaseRcSpeed implements Command{
	
	Devices device;
	
	public DecreaseRcSpeed (Devices newDevice)
	{
		device = newDevice;
	}

	public void execute() {

		device.down();
		
	}

}


