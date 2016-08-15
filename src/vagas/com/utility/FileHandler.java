package vagas.com.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

	private boolean saveFile(InputStream uploadedInputStream, String serverLocation) {

		try {
			OutputStream outpuStream = new FileOutputStream(new File(serverLocation));
			int read = 0;
			byte[] bytes = new byte[1024];

			outpuStream = new FileOutputStream(new File(serverLocation));
			while ((read = uploadedInputStream.read(bytes)) != -1) {
				outpuStream.write(bytes, 0, read);
			}
			outpuStream.flush();
			outpuStream.close();
			return true;
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}

	}
	
	
	@SuppressWarnings("resource")
	public List<String> ReadFileToStringList(String namePath) {
		List<String> stringList = new ArrayList<String>();
		BufferedReader br = null;
		String sCurrentLine;
		try {

			br = new BufferedReader(new FileReader(namePath));
			while ((sCurrentLine = br.readLine()) != null) {
				stringList.add(sCurrentLine);
			}

			return stringList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
