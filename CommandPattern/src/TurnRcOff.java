

public class TurnRcOff implements Command{
	
	Devices device;
	
	public TurnRcOff (Devices newDevice)
	{
		device = newDevice;
	}

	public void execute() {

		device.off();
		
	}

}
