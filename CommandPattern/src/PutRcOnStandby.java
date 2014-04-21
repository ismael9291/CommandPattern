


public class PutRcOnStandby implements Command{
	
	Devices device;
	
	public PutRcOnStandby (Devices newDevice)
	{
		device = newDevice;
	}

	public void execute() {

		device.standby();
		
	}

}
