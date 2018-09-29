package bluetooth;

import javax.bluetooth.DeviceClass;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.ServiceRecord;

public class BluetoothDiscoveryListener implements DiscoveryListener {

	@Override
	public void deviceDiscovered(RemoteDevice arg0, DeviceClass arg1) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getBluetoothAddress());
		return;

	}

	@Override
	public void inquiryCompleted(int arg0) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public void serviceSearchCompleted(int arg0, int arg1) {
		System.out.println("Service searh completed!!!");
		return;
	}

	@Override
	public void servicesDiscovered(int arg0, ServiceRecord[] arg1) {
		for(ServiceRecord record : arg1) {
			System.out.println(record.toString());
			return;
		}

	}

}
