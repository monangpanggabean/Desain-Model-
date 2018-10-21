/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 47 "model.ump"
// line 147 "model.ump"
public class Clusterizing
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Clusterizing Associations
  private List<Classifications> classifications;
  private List<AllProcesstoBuffers> allProcesstoBuffers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Clusterizing()
  {
    classifications = new ArrayList<Classifications>();
    allProcesstoBuffers = new ArrayList<AllProcesstoBuffers>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Classifications getClassification(int index)
  {
    Classifications aClassification = classifications.get(index);
    return aClassification;
  }

  public List<Classifications> getClassifications()
  {
    List<Classifications> newClassifications = Collections.unmodifiableList(classifications);
    return newClassifications;
  }

  public int numberOfClassifications()
  {
    int number = classifications.size();
    return number;
  }

  public boolean hasClassifications()
  {
    boolean has = classifications.size() > 0;
    return has;
  }

  public int indexOfClassification(Classifications aClassification)
  {
    int index = classifications.indexOf(aClassification);
    return index;
  }
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
  public static int minimumNumberOfClassifications()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addClassification(Classifications aClassification)
  {
    boolean wasAdded = false;
    if (classifications.contains(aClassification)) { return false; }
    classifications.add(aClassification);
    if (aClassification.indexOfClusterizing(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aClassification.addClusterizing(this);
      if (!wasAdded)
      {
        classifications.remove(aClassification);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeClassification(Classifications aClassification)
  {
    boolean wasRemoved = false;
    if (!classifications.contains(aClassification))
    {
      return wasRemoved;
    }

    int oldIndex = classifications.indexOf(aClassification);
    classifications.remove(oldIndex);
    if (aClassification.indexOfClusterizing(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aClassification.removeClusterizing(this);
      if (!wasRemoved)
      {
        classifications.add(oldIndex,aClassification);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addClassificationAt(Classifications aClassification, int index)
  {  
    boolean wasAdded = false;
    if(addClassification(aClassification))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClassifications()) { index = numberOfClassifications() - 1; }
      classifications.remove(aClassification);
      classifications.add(index, aClassification);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveClassificationAt(Classifications aClassification, int index)
  {
    boolean wasAdded = false;
    if(classifications.contains(aClassification))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClassifications()) { index = numberOfClassifications() - 1; }
      classifications.remove(aClassification);
      classifications.add(index, aClassification);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addClassificationAt(aClassification, index);
    }
    return wasAdded;
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
    if (aAllProcesstoBuffer.indexOfClusterizing(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAllProcesstoBuffer.addClusterizing(this);
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
    if (aAllProcesstoBuffer.indexOfClusterizing(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAllProcesstoBuffer.removeClusterizing(this);
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
    ArrayList<Classifications> copyOfClassifications = new ArrayList<Classifications>(classifications);
    classifications.clear();
    for(Classifications aClassification : copyOfClassifications)
    {
      aClassification.removeClusterizing(this);
    }
    ArrayList<AllProcesstoBuffers> copyOfAllProcesstoBuffers = new ArrayList<AllProcesstoBuffers>(allProcesstoBuffers);
    allProcesstoBuffers.clear();
    for(AllProcesstoBuffers aAllProcesstoBuffer : copyOfAllProcesstoBuffers)
    {
      aAllProcesstoBuffer.removeClusterizing(this);
    }
  }

}