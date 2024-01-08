package wordRepit.service;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.FileNameMap;
import java.util.List;

import wordRepit.Word;

public class FileServiceImp implements FileService {

	@Override
	public List<Word> load(String string) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			return (List<Word>) ois.readObject();
		}catch (Exception e) {
		}
		return null;
	}

}
