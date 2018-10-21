/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 60 "model.ump"
// line 163 "model.ump"
public class AllProcesstoBuffers
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AllProcesstoBuffers Associations
  private List<Function> functions;
  private List<Clusterizing> clusterizings;
  private List<Localizer> localizers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AllProcesstoBuffers()
  {
    functions = new ArrayList<Function>();
    clusterizings = new ArrayList<Clusterizing>();
    localizers = new ArrayList<Localizer>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Function getFunction(int index)
  {
    Function aFunction = functions.get(index);
    return aFunction;
  }

  public List<Function> getFunctions()
  {
    List<Function> newFunctions = Collections.unmodifiableList(functions);
    return newFunctions;
  }

  public int numberOfFunctions()
  {
    int number = functions.size();
    return number;
  }

  public boolean hasFunctions()
  {
    boolean has = functions.size() > 0;
    return has;
  }

  public int indexOfFunction(Function aFunction)
  {
    int index = functions.indexOf(aFunction);
    return index;
  }
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
  /* Code from template association_GetMany */
  public Localizer getLocalizer(int index)
  {
    Localizer aLocalizer = localizers.get(index);
    return aLocalizer;
  }

  public List<Localizer> getLocalizers()
  {
    List<Localizer> newLocalizers = Collections.unmodifiableList(localizers);
    return newLocalizers;
  }

  public int numberOfLocalizers()
  {
    int number = localizers.size();
    return number;
  }

  public boolean hasLocalizers()
  {
    boolean has = localizers.size() > 0;
    return has;
  }

  public int indexOfLocalizer(Localizer aLocalizer)
  {
    int index = localizers.indexOf(aLocalizer);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfFunctions()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addFunction(Function aFunction)
  {
    boolean wasAdded = false;
    if (functions.contains(aFunction)) { return false; }
    functions.add(aFunction);
    if (aFunction.indexOfAllProcesstoBuffer(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aFunction.addAllProcesstoBuffer(this);
      if (!wasAdded)
      {
        functions.remove(aFunction);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeFunction(Function aFunction)
  {
    boolean wasRemoved = false;
    if (!functions.contains(aFunction))
    {
      return wasRemoved;
    }

    int oldIndex = functions.indexOf(aFunction);
    functions.remove(oldIndex);
    if (aFunction.indexOfAllProcesstoBuffer(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aFunction.removeAllProcesstoBuffer(this);
      if (!wasRemoved)
      {
        functions.add(oldIndex,aFunction);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addFunctionAt(Function aFunction, int index)
  {  
    boolean wasAdded = false;
    if(addFunction(aFunction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFunctions()) { index = numberOfFunctions() - 1; }
      functions.remove(aFunction);
      functions.add(index, aFunction);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveFunctionAt(Function aFunction, int index)
  {
    boolean wasAdded = false;
    if(functions.contains(aFunction))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfFunctions()) { index = numberOfFunctions() - 1; }
      functions.remove(aFunction);
      functions.add(index, aFunction);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addFunctionAt(aFunction, index);
    }
    return wasAdded;
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
    if (aClusterizing.indexOfAllProcesstoBuffer(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aClusterizing.addAllProcesstoBuffer(this);
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
    if (aClusterizing.indexOfAllProcesstoBuffer(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aClusterizing.removeAllProcesstoBuffer(this);
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
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfLocalizers()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addLocalizer(Localizer aLocalizer)
  {
    boolean wasAdded = false;
    if (localizers.contains(aLocalizer)) { return false; }
    localizers.add(aLocalizer);
    if (aLocalizer.indexOfAllProcesstoBuffer(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aLocalizer.addAllProcesstoBuffer(this);
      if (!wasAdded)
      {
        localizers.remove(aLocalizer);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeLocalizer(Localizer aLocalizer)
  {
    boolean wasRemoved = false;
    if (!localizers.contains(aLocalizer))
    {
      return wasRemoved;
    }

    int oldIndex = localizers.indexOf(aLocalizer);
    localizers.remove(oldIndex);
    if (aLocalizer.indexOfAllProcesstoBuffer(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aLocalizer.removeAllProcesstoBuffer(this);
      if (!wasRemoved)
      {
        localizers.add(oldIndex,aLocalizer);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addLocalizerAt(Localizer aLocalizer, int index)
  {  
    boolean wasAdded = false;
    if(addLocalizer(aLocalizer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLocalizers()) { index = numberOfLocalizers() - 1; }
      localizers.remove(aLocalizer);
      localizers.add(index, aLocalizer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveLocalizerAt(Localizer aLocalizer, int index)
  {
    boolean wasAdded = false;
    if(localizers.contains(aLocalizer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfLocalizers()) { index = numberOfLocalizers() - 1; }
      localizers.remove(aLocalizer);
      localizers.add(index, aLocalizer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addLocalizerAt(aLocalizer, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<Function> copyOfFunctions = new ArrayList<Function>(functions);
    functions.clear();
    for(Function aFunction : copyOfFunctions)
    {
      aFunction.removeAllProcesstoBuffer(this);
    }
    ArrayList<Clusterizing> copyOfClusterizings = new ArrayList<Clusterizing>(clusterizings);
    clusterizings.clear();
    for(Clusterizing aClusterizing : copyOfClusterizings)
    {
      aClusterizing.removeAllProcesstoBuffer(this);
    }
    ArrayList<Localizer> copyOfLocalizers = new ArrayList<Localizer>(localizers);
    localizers.clear();
    for(Localizer aLocalizer : copyOfLocalizers)
    {
      aLocalizer.removeAllProcesstoBuffer(this);
    }
  }

}