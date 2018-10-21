/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 2 "model.ump"
// line 94 "model.ump"
public class SysCallReader extends ExecutedProcess
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //SysCallReader Associations
  private List<UsingSystem> usingSystems;
  private List<UsingIO> usingIOs;
  private List<AnyActions> anyActions;
  private List<Function> functions;
  private List<Parameters> parameters;
  private List<End> ends;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public SysCallReader()
  {
    super();
    usingSystems = new ArrayList<UsingSystem>();
    usingIOs = new ArrayList<UsingIO>();
    anyActions = new ArrayList<AnyActions>();
    functions = new ArrayList<Function>();
    parameters = new ArrayList<Parameters>();
    ends = new ArrayList<End>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public UsingSystem getUsingSystem(int index)
  {
    UsingSystem aUsingSystem = usingSystems.get(index);
    return aUsingSystem;
  }

  public List<UsingSystem> getUsingSystems()
  {
    List<UsingSystem> newUsingSystems = Collections.unmodifiableList(usingSystems);
    return newUsingSystems;
  }

  public int numberOfUsingSystems()
  {
    int number = usingSystems.size();
    return number;
  }

  public boolean hasUsingSystems()
  {
    boolean has = usingSystems.size() > 0;
    return has;
  }

  public int indexOfUsingSystem(UsingSystem aUsingSystem)
  {
    int index = usingSystems.indexOf(aUsingSystem);
    return index;
  }
  /* Code from template association_GetMany */
  public UsingIO getUsingIO(int index)
  {
    UsingIO aUsingIO = usingIOs.get(index);
    return aUsingIO;
  }

  public List<UsingIO> getUsingIOs()
  {
    List<UsingIO> newUsingIOs = Collections.unmodifiableList(usingIOs);
    return newUsingIOs;
  }

  public int numberOfUsingIOs()
  {
    int number = usingIOs.size();
    return number;
  }

  public boolean hasUsingIOs()
  {
    boolean has = usingIOs.size() > 0;
    return has;
  }

  public int indexOfUsingIO(UsingIO aUsingIO)
  {
    int index = usingIOs.indexOf(aUsingIO);
    return index;
  }
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
  public Parameters getParameter(int index)
  {
    Parameters aParameter = parameters.get(index);
    return aParameter;
  }

  public List<Parameters> getParameters()
  {
    List<Parameters> newParameters = Collections.unmodifiableList(parameters);
    return newParameters;
  }

  public int numberOfParameters()
  {
    int number = parameters.size();
    return number;
  }

  public boolean hasParameters()
  {
    boolean has = parameters.size() > 0;
    return has;
  }

  public int indexOfParameter(Parameters aParameter)
  {
    int index = parameters.indexOf(aParameter);
    return index;
  }
  /* Code from template association_GetMany */
  public End getEnd(int index)
  {
    End aEnd = ends.get(index);
    return aEnd;
  }

  public List<End> getEnds()
  {
    List<End> newEnds = Collections.unmodifiableList(ends);
    return newEnds;
  }

  public int numberOfEnds()
  {
    int number = ends.size();
    return number;
  }

  public boolean hasEnds()
  {
    boolean has = ends.size() > 0;
    return has;
  }

  public int indexOfEnd(End aEnd)
  {
    int index = ends.indexOf(aEnd);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUsingSystems()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addUsingSystem(UsingSystem aUsingSystem)
  {
    boolean wasAdded = false;
    if (usingSystems.contains(aUsingSystem)) { return false; }
    usingSystems.add(aUsingSystem);
    if (aUsingSystem.indexOfSysCallReader(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUsingSystem.addSysCallReader(this);
      if (!wasAdded)
      {
        usingSystems.remove(aUsingSystem);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeUsingSystem(UsingSystem aUsingSystem)
  {
    boolean wasRemoved = false;
    if (!usingSystems.contains(aUsingSystem))
    {
      return wasRemoved;
    }

    int oldIndex = usingSystems.indexOf(aUsingSystem);
    usingSystems.remove(oldIndex);
    if (aUsingSystem.indexOfSysCallReader(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUsingSystem.removeSysCallReader(this);
      if (!wasRemoved)
      {
        usingSystems.add(oldIndex,aUsingSystem);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUsingSystemAt(UsingSystem aUsingSystem, int index)
  {  
    boolean wasAdded = false;
    if(addUsingSystem(aUsingSystem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUsingSystems()) { index = numberOfUsingSystems() - 1; }
      usingSystems.remove(aUsingSystem);
      usingSystems.add(index, aUsingSystem);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUsingSystemAt(UsingSystem aUsingSystem, int index)
  {
    boolean wasAdded = false;
    if(usingSystems.contains(aUsingSystem))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUsingSystems()) { index = numberOfUsingSystems() - 1; }
      usingSystems.remove(aUsingSystem);
      usingSystems.add(index, aUsingSystem);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUsingSystemAt(aUsingSystem, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUsingIOs()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addUsingIO(UsingIO aUsingIO)
  {
    boolean wasAdded = false;
    if (usingIOs.contains(aUsingIO)) { return false; }
    usingIOs.add(aUsingIO);
    if (aUsingIO.indexOfSysCallReader(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aUsingIO.addSysCallReader(this);
      if (!wasAdded)
      {
        usingIOs.remove(aUsingIO);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeUsingIO(UsingIO aUsingIO)
  {
    boolean wasRemoved = false;
    if (!usingIOs.contains(aUsingIO))
    {
      return wasRemoved;
    }

    int oldIndex = usingIOs.indexOf(aUsingIO);
    usingIOs.remove(oldIndex);
    if (aUsingIO.indexOfSysCallReader(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aUsingIO.removeSysCallReader(this);
      if (!wasRemoved)
      {
        usingIOs.add(oldIndex,aUsingIO);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUsingIOAt(UsingIO aUsingIO, int index)
  {  
    boolean wasAdded = false;
    if(addUsingIO(aUsingIO))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUsingIOs()) { index = numberOfUsingIOs() - 1; }
      usingIOs.remove(aUsingIO);
      usingIOs.add(index, aUsingIO);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUsingIOAt(UsingIO aUsingIO, int index)
  {
    boolean wasAdded = false;
    if(usingIOs.contains(aUsingIO))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUsingIOs()) { index = numberOfUsingIOs() - 1; }
      usingIOs.remove(aUsingIO);
      usingIOs.add(index, aUsingIO);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUsingIOAt(aUsingIO, index);
    }
    return wasAdded;
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
    if (aAnyAction.indexOfSysCallReader(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAnyAction.addSysCallReader(this);
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
    if (aAnyAction.indexOfSysCallReader(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAnyAction.removeSysCallReader(this);
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
    if (aFunction.indexOfSysCallReader(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aFunction.addSysCallReader(this);
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
    if (aFunction.indexOfSysCallReader(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aFunction.removeSysCallReader(this);
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
  public static int minimumNumberOfParameters()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addParameter(Parameters aParameter)
  {
    boolean wasAdded = false;
    if (parameters.contains(aParameter)) { return false; }
    parameters.add(aParameter);
    if (aParameter.indexOfSysCallReader(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aParameter.addSysCallReader(this);
      if (!wasAdded)
      {
        parameters.remove(aParameter);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeParameter(Parameters aParameter)
  {
    boolean wasRemoved = false;
    if (!parameters.contains(aParameter))
    {
      return wasRemoved;
    }

    int oldIndex = parameters.indexOf(aParameter);
    parameters.remove(oldIndex);
    if (aParameter.indexOfSysCallReader(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aParameter.removeSysCallReader(this);
      if (!wasRemoved)
      {
        parameters.add(oldIndex,aParameter);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addParameterAt(Parameters aParameter, int index)
  {  
    boolean wasAdded = false;
    if(addParameter(aParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParameters()) { index = numberOfParameters() - 1; }
      parameters.remove(aParameter);
      parameters.add(index, aParameter);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveParameterAt(Parameters aParameter, int index)
  {
    boolean wasAdded = false;
    if(parameters.contains(aParameter))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfParameters()) { index = numberOfParameters() - 1; }
      parameters.remove(aParameter);
      parameters.add(index, aParameter);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addParameterAt(aParameter, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfEnds()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addEnd(End aEnd)
  {
    boolean wasAdded = false;
    if (ends.contains(aEnd)) { return false; }
    ends.add(aEnd);
    if (aEnd.indexOfSysCallReader(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aEnd.addSysCallReader(this);
      if (!wasAdded)
      {
        ends.remove(aEnd);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeEnd(End aEnd)
  {
    boolean wasRemoved = false;
    if (!ends.contains(aEnd))
    {
      return wasRemoved;
    }

    int oldIndex = ends.indexOf(aEnd);
    ends.remove(oldIndex);
    if (aEnd.indexOfSysCallReader(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aEnd.removeSysCallReader(this);
      if (!wasRemoved)
      {
        ends.add(oldIndex,aEnd);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addEndAt(End aEnd, int index)
  {  
    boolean wasAdded = false;
    if(addEnd(aEnd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnds()) { index = numberOfEnds() - 1; }
      ends.remove(aEnd);
      ends.add(index, aEnd);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveEndAt(End aEnd, int index)
  {
    boolean wasAdded = false;
    if(ends.contains(aEnd))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfEnds()) { index = numberOfEnds() - 1; }
      ends.remove(aEnd);
      ends.add(index, aEnd);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addEndAt(aEnd, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<UsingSystem> copyOfUsingSystems = new ArrayList<UsingSystem>(usingSystems);
    usingSystems.clear();
    for(UsingSystem aUsingSystem : copyOfUsingSystems)
    {
      aUsingSystem.removeSysCallReader(this);
    }
    ArrayList<UsingIO> copyOfUsingIOs = new ArrayList<UsingIO>(usingIOs);
    usingIOs.clear();
    for(UsingIO aUsingIO : copyOfUsingIOs)
    {
      aUsingIO.removeSysCallReader(this);
    }
    ArrayList<AnyActions> copyOfAnyActions = new ArrayList<AnyActions>(anyActions);
    anyActions.clear();
    for(AnyActions aAnyAction : copyOfAnyActions)
    {
      aAnyAction.removeSysCallReader(this);
    }
    ArrayList<Function> copyOfFunctions = new ArrayList<Function>(functions);
    functions.clear();
    for(Function aFunction : copyOfFunctions)
    {
      aFunction.removeSysCallReader(this);
    }
    ArrayList<Parameters> copyOfParameters = new ArrayList<Parameters>(parameters);
    parameters.clear();
    for(Parameters aParameter : copyOfParameters)
    {
      aParameter.removeSysCallReader(this);
    }
    ArrayList<End> copyOfEnds = new ArrayList<End>(ends);
    ends.clear();
    for(End aEnd : copyOfEnds)
    {
      aEnd.removeSysCallReader(this);
    }
    super.delete();
  }

}