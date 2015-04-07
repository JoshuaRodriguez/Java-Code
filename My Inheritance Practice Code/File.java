
public class File extends Document 
{
	private String pathName;
	
	// Constructors for File Class //
	
	public File()
	{
		super();
		pathName = null;
	}
	
	public File(String nameOfPath, String textToStore)
	{
		super(textToStore);
		pathName = nameOfPath;
	}

	// Copy constructor for File Class // 
	
	public File(File copyfile)
	{
		super(copyfile);
		pathName = copyfile.pathName;
	}

	// Accessor methods for File Class //
	
	public String retrieveFileText()
	{
		return returnDocText();
	}
	
	public String retrievePathName()
	{
		return pathName;
	}

	// Mutator methods for File Class //
	
	public void setFileText(String textInput)
	{
		setTextToDocument(textInput);
	}
	
	public void setPathName(String nameOfPath)
	{
		pathName = nameOfPath;
	}
	
	// toString and equals methods for File class // 
	
	public String toString()
	{
		return("File Location: " + pathName + "\n" + returnDocText());
	}
	
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			File checkFile = (File)otherObject;
			return ( pathName == checkFile.pathName && returnDocText().equals(checkFile.returnDocText()) );
		}
	}
}
