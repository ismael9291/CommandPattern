

public class TurnRcOn implements Command{
	
	Devices device;
	
	public TurnRcOn (Devices newDevice)
	{
		device = newDevice;
	}

	public void execute() {

		device.on();
		
	}

}
