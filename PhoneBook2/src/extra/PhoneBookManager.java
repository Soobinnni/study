package extra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

import selectInterface.*;

import phoneBookClass.*;

public class PhoneBookManager {
	
	static PhoneBookManager inst=null;
	public static PhoneBookManager creatManagerInst() {
		if(inst == null) {
				inst = new PhoneBookManager();
		}
		return inst;
	}
	//public 
}
