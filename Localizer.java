/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 56 "model.ump"
// line 158 "model.ump"
public class Localizer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Localizer Associations
  private List<AllProcesstoBuffers> allProcesstoBuffers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Localizer()
  {
    allProcesstoBuffers = new ArrayList<AllProcesstoBuffers>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public AllProcesstoBuffers getAllProcesstoBuffer(int index)
  {
    AllProcesstoBuffers aAllProcesstoBuffer = allProcesstoBuffers.get(index);
    return aAllProcesstoBuffer;
  }

  public List<AllProcesstoBuffers> getAllProcesstoBuffers()
  {
    List<AllProcesstoBuffers> newAllProcesstoBuffers = Collections.unmodifiableList(allProcesstoBuffers);
    return newAllProcesstoBuffers;
  }

  public int numberOfAllProcesstoBuffers()
  {
    int number = allProcesstoBuffers.size();
    return number;
  }

  public boolean hasAllProcesstoBuffers()
  {
    boolean has = allProcesstoBuffers.size() > 0;
    return has;
  }

  public int indexOfAllProcesstoBuffer(AllProcesstoBuffers aAllProcesstoBuffer)
  {
    int index = allProcesstoBuffers.indexOf(aAllProcesstoBuffer);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAllProcesstoBuffers()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAllProcesstoBuffer(AllProcesstoBuffers aAllProcesstoBuffer)
  {
    boolean wasAdded = false;
    if (allProcesstoBuffers.contains(aAllProcesstoBuffer)) { return false; }
    allProcesstoBuffers.add(aAllProcesstoBuffer);
    if (aAllProcesstoBuffer.indexOfLocalizer(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAllProcesstoBuffer.addLocalizer(this);
      if (!wasAdded)
      {
        allProcesstoBuffers.remove(aAllProcesstoBuffer);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAllProcesstoBuffer(AllProcesstoBuffers aAllProcesstoBuffer)
  {
    boolean wasRemoved = false;
    if (!allProcesstoBuffers.contains(aAllProcesstoBuffer))
    {
      return wasRemoved;
    }

    int oldIndex = allProcesstoBuffers.indexOf(aAllProcesstoBuffer);
    allProcesstoBuffers.remove(oldIndex);
    if (aAllProcesstoBuffer.indexOfLocalizer(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAllProcesstoBuffer.removeLocalizer(this);
      if (!wasRemoved)
      {
        allProcesstoBuffers.add(oldIndex,aAllProcesstoBuffer);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAllProcesstoBufferAt(AllProcesstoBuffers aAllProcesstoBuffer, int index)
  {  
    boolean wasAdded = false;
    if(addAllProcesstoBuffer(aAllProcesstoBuffer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAllProcesstoBuffers()) { index = numberOfAllProcesstoBuffers() - 1; }
      allProcesstoBuffers.remove(aAllProcesstoBuffer);
      allProcesstoBuffers.add(index, aAllProcesstoBuffer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAllProcesstoBufferAt(AllProcesstoBuffers aAllProcesstoBuffer, int index)
  {
    boolean wasAdded = false;
    if(allProcesstoBuffers.contains(aAllProcesstoBuffer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAllProcesstoBuffers()) { index = numberOfAllProcesstoBuffers() - 1; }
      allProcesstoBuffers.remove(aAllProcesstoBuffer);
      allProcesstoBuffers.add(index, aAllProcesstoBuffer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAllProcesstoBufferAt(aAllProcesstoBuffer, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<AllProcesstoBuffers> copyOfAllProcesstoBuffers = new ArrayList<AllProcesstoBuffers>(allProcesstoBuffers);
    allProcesstoBuffers.clear();
    for(AllProcesstoBuffers aAllProcesstoBuffer : copyOfAllProcesstoBuffers)
    {
      aAllProcesstoBuffer.removeLocalizer(this);
    }
  }

}