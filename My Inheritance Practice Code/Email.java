
public class Email extends Document
{
	private String sender;
	private String recipient;
	private String title;
	
	// Constructor For Email Class //
	
	public Email()
	{
		super();
		sender = null;
		recipient = null;
		title = null;
	}

	public Email(String emailSender, String emailRecipient, String emailTitle, String textInput)
	{
		super(textInput);
		sender = emailSender;
		recipient = emailRecipient;
		title = emailTitle;
	}

	// Copy constructor for Email Class //
	
	public Email(Email copyEmail)
	{
		super(copyEmail);
		sender = copyEmail.sender;
		recipient = copyEmail.recipient;
		title = copyEmail.title;
	}

	// Accessor Methods for Email Class

	public String returnEmailText()
	{
		return returnDocText();
	}

	public String returnSender()
	{
		return sender;
	}
	
	public String returnRecipient()
	{
		return recipient;
	}

	public String returnEmailTitle()
	{
		return title;
	}

	// Mutator Methods for Email Class //
	
	public void setEmailText(String textInput)
	{
		setTextToDocument(textInput);
	}
	
	public void setSender(String inputSender)
	{
		sender = inputSender;
	}
	
	public void setRecipient(String inputRecipient)
	{
		recipient = inputRecipient;
	}

	public void setEmailTitle(String inputEmailTitle)
	{
		title = inputEmailTitle;
	}

	// equals and toString Methods //
	
	public boolean equals(Object otherObject)
	{
		if(otherObject == null)
			return false;
		else if(getClass() != otherObject.getClass())
			return false;
		else
		{
			Email checkEmail = (Email)otherObject;
			return(returnEmailText().equals(checkEmail.returnEmailText()) && sender.equals(checkEmail.sender))
					&& recipient.equals(checkEmail.recipient) && title.equals(checkEmail.title);
		}
	}

	public String toString()
	{
		return ("From: " + sender + "\n" + "To: " + recipient + "\n" + "Subject: " + title + 
				"\n" + "Body: " + returnDocText());
	}
}
