package com.tutk.kalay.vsaas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadDeviceInformation {
	public ArrayList<String> DeviceList = new ArrayList<String>();
	public ArrayList<String> deviceName = new ArrayList<String>();
	public ArrayList<String> platformVersion = new ArrayList<String>();

	public LoadDeviceInformation() {
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\device.txt");

		} catch (FileNotFoundException e) {
			System.out.println("找不到C:\\Device.txt");
		}

		BufferedReader br = new BufferedReader(fr);
		String line;
		String[] DeviceList;

		try {
			while ((line = br.readLine()) != null) {
				deviceName = new ArrayList<String>();
				platformVersion = new ArrayList<String>();
				DeviceList = line.split(",");

				if (DeviceList.length % 2 == 0) {
					for (int i = 0; i < DeviceList.length / 2; i++) {

						deviceName.add(DeviceList[i]);
					}
					for (int i = (DeviceList.length / 2); i < DeviceList.length; i++) {

						platformVersion.add(DeviceList[i]);
					}

					System.out.println("測試設備(UDID/Android Version)");

					for (int i = 0; i < DeviceList.length / 2; i++) {
						System.out.print(deviceName.get(i) + "/");
						System.out.println(platformVersion.get(i));
					}

				} else {
					System.out.println("C:\\Device.txt內容資訊有誤");
				}
			}
		} catch (IOException e) {
			;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
