
public class Document
{
	private String text;
	
	// Constructors For Document Class //
	
	public Document()
	{
		text = null;
	}
	
	public Document(String textInput)
	{
		text = textInput;
	}
	
	// Copy Constructor For Document Class //
	
	public Document(Document copyDocument)
	{
		text = copyDocument.text;
	}

	// Mutator Method For Document Class //
	
	public void setTextToDocument(String textInput)
	{
		text = textInput;
	}
	
	// Accessor Method For Document Class //
	
	public String returnDocText()
	{
		return text;
	}
	
	// toString and equals method for Document Class //
	
	public String toString()
	{
		return text;
	}
	
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Document checkDocument = (Document)otherObject;
			return (text == checkDocument.text);
		}
	}
}
