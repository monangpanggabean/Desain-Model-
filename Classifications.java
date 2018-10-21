/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 51 "model.ump"
// line 152 "model.ump"
public class Classifications
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Classifications Associations
  private List<Clusterizing> clusterizings;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Classifications()
  {
    clusterizings = new ArrayList<Clusterizing>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Clusterizing getClusterizing(int index)
  {
    Clusterizing aClusterizing = clusterizings.get(index);
    return aClusterizing;
  }

  public List<Clusterizing> getClusterizings()
  {
    List<Clusterizing> newClusterizings = Collections.unmodifiableList(clusterizings);
    return newClusterizings;
  }

  public int numberOfClusterizings()
  {
    int number = clusterizings.size();
    return number;
  }

  public boolean hasClusterizings()
  {
    boolean has = clusterizings.size() > 0;
    return has;
  }

  public int indexOfClusterizing(Clusterizing aClusterizing)
  {
    int index = clusterizings.indexOf(aClusterizing);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfClusterizings()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addClusterizing(Clusterizing aClusterizing)
  {
    boolean wasAdded = false;
    if (clusterizings.contains(aClusterizing)) { return false; }
    clusterizings.add(aClusterizing);
    if (aClusterizing.indexOfClassification(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aClusterizing.addClassification(this);
      if (!wasAdded)
      {
        clusterizings.remove(aClusterizing);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeClusterizing(Clusterizing aClusterizing)
  {
    boolean wasRemoved = false;
    if (!clusterizings.contains(aClusterizing))
    {
      return wasRemoved;
    }

    int oldIndex = clusterizings.indexOf(aClusterizing);
    clusterizings.remove(oldIndex);
    if (aClusterizing.indexOfClassification(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aClusterizing.removeClassification(this);
      if (!wasRemoved)
      {
        clusterizings.add(oldIndex,aClusterizing);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addClusterizingAt(Clusterizing aClusterizing, int index)
  {  
    boolean wasAdded = false;
    if(addClusterizing(aClusterizing))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClusterizings()) { index = numberOfClusterizings() - 1; }
      clusterizings.remove(aClusterizing);
      clusterizings.add(index, aClusterizing);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveClusterizingAt(Clusterizing aClusterizing, int index)
  {
    boolean wasAdded = false;
    if(clusterizings.contains(aClusterizing))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfClusterizings()) { index = numberOfClusterizings() - 1; }
      clusterizings.remove(aClusterizing);
      clusterizings.add(index, aClusterizing);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addClusterizingAt(aClusterizing, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Clusterizing> copyOfClusterizings = new ArrayList<Clusterizing>(clusterizings);
    clusterizings.clear();
    for(Clusterizing aClusterizing : copyOfClusterizings)
    {
      aClusterizing.removeClassification(this);
    }
  }

}