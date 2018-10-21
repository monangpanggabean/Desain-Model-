/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 36 "model.ump"
// line 134 "model.ump"
public class Function
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Function Associations
  private List<SysCallReader> sysCallReaders;
  private List<InterfaceforAgentExecManager> interfaceforAgentExecManagers;
  private List<AllProcesstoBuffers> allProcesstoBuffers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Function()
  {
    sysCallReaders = new ArrayList<SysCallReader>();
    interfaceforAgentExecManagers = new ArrayList<InterfaceforAgentExecManager>();
    allProcesstoBuffers = new ArrayList<AllProcesstoBuffers>();
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
  public InterfaceforAgentExecManager getInterfaceforAgentExecManager(int index)
  {
    InterfaceforAgentExecManager aInterfaceforAgentExecManager = interfaceforAgentExecManagers.get(index);
    return aInterfaceforAgentExecManager;
  }

  public List<InterfaceforAgentExecManager> getInterfaceforAgentExecManagers()
  {
    List<InterfaceforAgentExecManager> newInterfaceforAgentExecManagers = Collections.unmodifiableList(interfaceforAgentExecManagers);
    return newInterfaceforAgentExecManagers;
  }

  public int numberOfInterfaceforAgentExecManagers()
  {
    int number = interfaceforAgentExecManagers.size();
    return number;
  }

  public boolean hasInterfaceforAgentExecManagers()
  {
    boolean has = interfaceforAgentExecManagers.size() > 0;
    return has;
  }

  public int indexOfInterfaceforAgentExecManager(InterfaceforAgentExecManager aInterfaceforAgentExecManager)
  {
    int index = interfaceforAgentExecManagers.indexOf(aInterfaceforAgentExecManager);
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
    if (aSysCallReader.indexOfFunction(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aSysCallReader.addFunction(this);
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
    if (aSysCallReader.indexOfFunction(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aSysCallReader.removeFunction(this);
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
  public static int minimumNumberOfInterfaceforAgentExecManagers()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addInterfaceforAgentExecManager(InterfaceforAgentExecManager aInterfaceforAgentExecManager)
  {
    boolean wasAdded = false;
    if (interfaceforAgentExecManagers.contains(aInterfaceforAgentExecManager)) { return false; }
    interfaceforAgentExecManagers.add(aInterfaceforAgentExecManager);
    if (aInterfaceforAgentExecManager.indexOfFunction(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aInterfaceforAgentExecManager.addFunction(this);
      if (!wasAdded)
      {
        interfaceforAgentExecManagers.remove(aInterfaceforAgentExecManager);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeInterfaceforAgentExecManager(InterfaceforAgentExecManager aInterfaceforAgentExecManager)
  {
    boolean wasRemoved = false;
    if (!interfaceforAgentExecManagers.contains(aInterfaceforAgentExecManager))
    {
      return wasRemoved;
    }

    int oldIndex = interfaceforAgentExecManagers.indexOf(aInterfaceforAgentExecManager);
    interfaceforAgentExecManagers.remove(oldIndex);
    if (aInterfaceforAgentExecManager.indexOfFunction(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aInterfaceforAgentExecManager.removeFunction(this);
      if (!wasRemoved)
      {
        interfaceforAgentExecManagers.add(oldIndex,aInterfaceforAgentExecManager);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addInterfaceforAgentExecManagerAt(InterfaceforAgentExecManager aInterfaceforAgentExecManager, int index)
  {  
    boolean wasAdded = false;
    if(addInterfaceforAgentExecManager(aInterfaceforAgentExecManager))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInterfaceforAgentExecManagers()) { index = numberOfInterfaceforAgentExecManagers() - 1; }
      interfaceforAgentExecManagers.remove(aInterfaceforAgentExecManager);
      interfaceforAgentExecManagers.add(index, aInterfaceforAgentExecManager);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveInterfaceforAgentExecManagerAt(InterfaceforAgentExecManager aInterfaceforAgentExecManager, int index)
  {
    boolean wasAdded = false;
    if(interfaceforAgentExecManagers.contains(aInterfaceforAgentExecManager))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfInterfaceforAgentExecManagers()) { index = numberOfInterfaceforAgentExecManagers() - 1; }
      interfaceforAgentExecManagers.remove(aInterfaceforAgentExecManager);
      interfaceforAgentExecManagers.add(index, aInterfaceforAgentExecManager);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addInterfaceforAgentExecManagerAt(aInterfaceforAgentExecManager, index);
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
    if (aAllProcesstoBuffer.indexOfFunction(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aAllProcesstoBuffer.addFunction(this);
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
    if (aAllProcesstoBuffer.indexOfFunction(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aAllProcesstoBuffer.removeFunction(this);
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
    ArrayList<SysCallReader> copyOfSysCallReaders = new ArrayList<SysCallReader>(sysCallReaders);
    sysCallReaders.clear();
    for(SysCallReader aSysCallReader : copyOfSysCallReaders)
    {
      aSysCallReader.removeFunction(this);
    }
    ArrayList<InterfaceforAgentExecManager> copyOfInterfaceforAgentExecManagers = new ArrayList<InterfaceforAgentExecManager>(interfaceforAgentExecManagers);
    interfaceforAgentExecManagers.clear();
    for(InterfaceforAgentExecManager aInterfaceforAgentExecManager : copyOfInterfaceforAgentExecManagers)
    {
      aInterfaceforAgentExecManager.removeFunction(this);
    }
    ArrayList<AllProcesstoBuffers> copyOfAllProcesstoBuffers = new ArrayList<AllProcesstoBuffers>(allProcesstoBuffers);
    allProcesstoBuffers.clear();
    for(AllProcesstoBuffers aAllProcesstoBuffer : copyOfAllProcesstoBuffers)
    {
      aAllProcesstoBuffer.removeFunction(this);
    }
  }

}