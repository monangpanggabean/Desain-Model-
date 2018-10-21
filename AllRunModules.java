/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 22 "model.ump"
// line 117 "model.ump"
public class AllRunModules
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AllRunModules Associations
  private List<AnyActions> anyActions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AllRunModules()
  {
    anyActions = new ArrayList<AnyActions>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public AnyActions getAnyAction(int index)
  {
    AnyActions aAnyAction = anyActions.get(index);
    return aAnyAction;
  }

  public List<AnyActions> getAnyActions()
  {
    List<AnyActions> newAnyActions = Collections.unmodifiableList(anyActions);
    return newAnyActions;
  }

  public int numberOfAnyActions()
  {
    int number = anyActions.size();
    return number;
  }

  public boolean hasAnyActions()
  {
    boolean has = anyActions.size() > 0;
    return has;
  }

  public int indexOfAnyAction(AnyActions aAnyAction)
  {
    int index = anyActions.indexOf(aAnyAction);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAnyActions()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAnyAction(AnyActions aAnyAction)
  {
    boolean wasAdded = false;
    if (anyActions.contains(aAnyAction)) { return false; }
    anyActions.add(aAnyAction);
    if (aAnyAction.indexOfAllRunModule(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAnyAction.addAllRunModule(this);
      if (!wasAdded)
      {
        anyActions.remove(aAnyAction);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAnyAction(AnyActions aAnyAction)
  {
    boolean wasRemoved = false;
    if (!anyActions.contains(aAnyAction))
    {
      return wasRemoved;
    }

    int oldIndex = anyActions.indexOf(aAnyAction);
    anyActions.remove(oldIndex);
    if (aAnyAction.indexOfAllRunModule(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAnyAction.removeAllRunModule(this);
      if (!wasRemoved)
      {
        anyActions.add(oldIndex,aAnyAction);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAnyActionAt(AnyActions aAnyAction, int index)
  {  
    boolean wasAdded = false;
    if(addAnyAction(aAnyAction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAnyActions()) { index = numberOfAnyActions() - 1; }
      anyActions.remove(aAnyAction);
      anyActions.add(index, aAnyAction);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAnyActionAt(AnyActions aAnyAction, int index)
  {
    boolean wasAdded = false;
    if(anyActions.contains(aAnyAction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAnyActions()) { index = numberOfAnyActions() - 1; }
      anyActions.remove(aAnyAction);
      anyActions.add(index, aAnyAction);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAnyActionAt(aAnyAction, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<AnyActions> copyOfAnyActions = new ArrayList<AnyActions>(anyActions);
    anyActions.clear();
    for(AnyActions aAnyAction : copyOfAnyActions)
    {
      aAnyAction.removeAllRunModule(this);
    }
  }

}