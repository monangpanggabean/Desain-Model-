/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 17 "model.ump"
// line 111 "model.ump"
public class AnyActions
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AnyActions Associations
  private List<SysCallReader> sysCallReaders;
  private List<AllRunModules> allRunModules;
  private List<AllRunExecutions> allRunExecutions;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AnyActions()
  {
    sysCallReaders = new ArrayList<SysCallReader>();
    allRunModules = new ArrayList<AllRunModules>();
    allRunExecutions = new ArrayList<AllRunExecutions>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public SysCallReader getSysCallReader(int index)
  {
    SysCallReader aSysCallReader = sysCallReaders.get(index);
    return aSysCallReader;
  }

  public List<SysCallReader> getSysCallReaders()
  {
    List<SysCallReader> newSysCallReaders = Collections.unmodifiableList(sysCallReaders);
    return newSysCallReaders;
  }

  public int numberOfSysCallReaders()
  {
    int number = sysCallReaders.size();
    return number;
  }

  public boolean hasSysCallReaders()
  {
    boolean has = sysCallReaders.size() > 0;
    return has;
  }

  public int indexOfSysCallReader(SysCallReader aSysCallReader)
  {
    int index = sysCallReaders.indexOf(aSysCallReader);
    return index;
  }
  /* Code from template association_GetMany */
  public AllRunModules getAllRunModule(int index)
  {
    AllRunModules aAllRunModule = allRunModules.get(index);
    return aAllRunModule;
  }

  public List<AllRunModules> getAllRunModules()
  {
    List<AllRunModules> newAllRunModules = Collections.unmodifiableList(allRunModules);
    return newAllRunModules;
  }

  public int numberOfAllRunModules()
  {
    int number = allRunModules.size();
    return number;
  }

  public boolean hasAllRunModules()
  {
    boolean has = allRunModules.size() > 0;
    return has;
  }

  public int indexOfAllRunModule(AllRunModules aAllRunModule)
  {
    int index = allRunModules.indexOf(aAllRunModule);
    return index;
  }
  /* Code from template association_GetMany */
  public AllRunExecutions getAllRunExecution(int index)
  {
    AllRunExecutions aAllRunExecution = allRunExecutions.get(index);
    return aAllRunExecution;
  }

  public List<AllRunExecutions> getAllRunExecutions()
  {
    List<AllRunExecutions> newAllRunExecutions = Collections.unmodifiableList(allRunExecutions);
    return newAllRunExecutions;
  }

  public int numberOfAllRunExecutions()
  {
    int number = allRunExecutions.size();
    return number;
  }

  public boolean hasAllRunExecutions()
  {
    boolean has = allRunExecutions.size() > 0;
    return has;
  }

  public int indexOfAllRunExecution(AllRunExecutions aAllRunExecution)
  {
    int index = allRunExecutions.indexOf(aAllRunExecution);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfSysCallReaders()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addSysCallReader(SysCallReader aSysCallReader)
  {
    boolean wasAdded = false;
    if (sysCallReaders.contains(aSysCallReader)) { return false; }
    sysCallReaders.add(aSysCallReader);
    if (aSysCallReader.indexOfAnyAction(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSysCallReader.addAnyAction(this);
      if (!wasAdded)
      {
        sysCallReaders.remove(aSysCallReader);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeSysCallReader(SysCallReader aSysCallReader)
  {
    boolean wasRemoved = false;
    if (!sysCallReaders.contains(aSysCallReader))
    {
      return wasRemoved;
    }

    int oldIndex = sysCallReaders.indexOf(aSysCallReader);
    sysCallReaders.remove(oldIndex);
    if (aSysCallReader.indexOfAnyAction(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSysCallReader.removeAnyAction(this);
      if (!wasRemoved)
      {
        sysCallReaders.add(oldIndex,aSysCallReader);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addSysCallReaderAt(SysCallReader aSysCallReader, int index)
  {  
    boolean wasAdded = false;
    if(addSysCallReader(aSysCallReader))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSysCallReaders()) { index = numberOfSysCallReaders() - 1; }
      sysCallReaders.remove(aSysCallReader);
      sysCallReaders.add(index, aSysCallReader);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSysCallReaderAt(SysCallReader aSysCallReader, int index)
  {
    boolean wasAdded = false;
    if(sysCallReaders.contains(aSysCallReader))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSysCallReaders()) { index = numberOfSysCallReaders() - 1; }
      sysCallReaders.remove(aSysCallReader);
      sysCallReaders.add(index, aSysCallReader);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSysCallReaderAt(aSysCallReader, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAllRunModules()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAllRunModule(AllRunModules aAllRunModule)
  {
    boolean wasAdded = false;
    if (allRunModules.contains(aAllRunModule)) { return false; }
    allRunModules.add(aAllRunModule);
    if (aAllRunModule.indexOfAnyAction(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAllRunModule.addAnyAction(this);
      if (!wasAdded)
      {
        allRunModules.remove(aAllRunModule);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAllRunModule(AllRunModules aAllRunModule)
  {
    boolean wasRemoved = false;
    if (!allRunModules.contains(aAllRunModule))
    {
      return wasRemoved;
    }

    int oldIndex = allRunModules.indexOf(aAllRunModule);
    allRunModules.remove(oldIndex);
    if (aAllRunModule.indexOfAnyAction(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAllRunModule.removeAnyAction(this);
      if (!wasRemoved)
      {
        allRunModules.add(oldIndex,aAllRunModule);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAllRunModuleAt(AllRunModules aAllRunModule, int index)
  {  
    boolean wasAdded = false;
    if(addAllRunModule(aAllRunModule))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAllRunModules()) { index = numberOfAllRunModules() - 1; }
      allRunModules.remove(aAllRunModule);
      allRunModules.add(index, aAllRunModule);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAllRunModuleAt(AllRunModules aAllRunModule, int index)
  {
    boolean wasAdded = false;
    if(allRunModules.contains(aAllRunModule))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAllRunModules()) { index = numberOfAllRunModules() - 1; }
      allRunModules.remove(aAllRunModule);
      allRunModules.add(index, aAllRunModule);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAllRunModuleAt(aAllRunModule, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfAllRunExecutions()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addAllRunExecution(AllRunExecutions aAllRunExecution)
  {
    boolean wasAdded = false;
    if (allRunExecutions.contains(aAllRunExecution)) { return false; }
    allRunExecutions.add(aAllRunExecution);
    if (aAllRunExecution.indexOfAnyAction(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAllRunExecution.addAnyAction(this);
      if (!wasAdded)
      {
        allRunExecutions.remove(aAllRunExecution);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeAllRunExecution(AllRunExecutions aAllRunExecution)
  {
    boolean wasRemoved = false;
    if (!allRunExecutions.contains(aAllRunExecution))
    {
      return wasRemoved;
    }

    int oldIndex = allRunExecutions.indexOf(aAllRunExecution);
    allRunExecutions.remove(oldIndex);
    if (aAllRunExecution.indexOfAnyAction(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAllRunExecution.removeAnyAction(this);
      if (!wasRemoved)
      {
        allRunExecutions.add(oldIndex,aAllRunExecution);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addAllRunExecutionAt(AllRunExecutions aAllRunExecution, int index)
  {  
    boolean wasAdded = false;
    if(addAllRunExecution(aAllRunExecution))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAllRunExecutions()) { index = numberOfAllRunExecutions() - 1; }
      allRunExecutions.remove(aAllRunExecution);
      allRunExecutions.add(index, aAllRunExecution);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveAllRunExecutionAt(AllRunExecutions aAllRunExecution, int index)
  {
    boolean wasAdded = false;
    if(allRunExecutions.contains(aAllRunExecution))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfAllRunExecutions()) { index = numberOfAllRunExecutions() - 1; }
      allRunExecutions.remove(aAllRunExecution);
      allRunExecutions.add(index, aAllRunExecution);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addAllRunExecutionAt(aAllRunExecution, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<SysCallReader> copyOfSysCallReaders = new ArrayList<SysCallReader>(sysCallReaders);
    sysCallReaders.clear();
    for(SysCallReader aSysCallReader : copyOfSysCallReaders)
    {
      aSysCallReader.removeAnyAction(this);
    }
    ArrayList<AllRunModules> copyOfAllRunModules = new ArrayList<AllRunModules>(allRunModules);
    allRunModules.clear();
    for(AllRunModules aAllRunModule : copyOfAllRunModules)
    {
      aAllRunModule.removeAnyAction(this);
    }
    ArrayList<AllRunExecutions> copyOfAllRunExecutions = new ArrayList<AllRunExecutions>(allRunExecutions);
    allRunExecutions.clear();
    for(AllRunExecutions aAllRunExecution : copyOfAllRunExecutions)
    {
      aAllRunExecution.removeAnyAction(this);
    }
  }

}