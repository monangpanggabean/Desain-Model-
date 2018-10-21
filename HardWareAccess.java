/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 72 "model.ump"
// line 177 "model.ump"
public class HardWareAccess
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //HardWareAccess Associations
  private List<InterfaceforAgentExecManager> interfaceforAgentExecManagers;
  private List<Registers> registers;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public HardWareAccess()
  {
    interfaceforAgentExecManagers = new ArrayList<InterfaceforAgentExecManager>();
    registers = new ArrayList<Registers>();
  }

  //------------------------
  // INTERFACE
  //------------------------
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
  public Registers getRegister(int index)
  {
    Registers aRegister = registers.get(index);
    return aRegister;
  }

  public List<Registers> getRegisters()
  {
    List<Registers> newRegisters = Collections.unmodifiableList(registers);
    return newRegisters;
  }

  public int numberOfRegisters()
  {
    int number = registers.size();
    return number;
  }

  public boolean hasRegisters()
  {
    boolean has = registers.size() > 0;
    return has;
  }

  public int indexOfRegister(Registers aRegister)
  {
    int index = registers.indexOf(aRegister);
    return index;
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
    if (aInterfaceforAgentExecManager.indexOfHardWareAccess(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aInterfaceforAgentExecManager.addHardWareAccess(this);
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
    if (aInterfaceforAgentExecManager.indexOfHardWareAccess(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aInterfaceforAgentExecManager.removeHardWareAccess(this);
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
  public static int minimumNumberOfRegisters()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addRegister(Registers aRegister)
  {
    boolean wasAdded = false;
    if (registers.contains(aRegister)) { return false; }
    registers.add(aRegister);
    if (aRegister.indexOfHardWareAccess(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aRegister.addHardWareAccess(this);
      if (!wasAdded)
      {
        registers.remove(aRegister);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeRegister(Registers aRegister)
  {
    boolean wasRemoved = false;
    if (!registers.contains(aRegister))
    {
      return wasRemoved;
    }

    int oldIndex = registers.indexOf(aRegister);
    registers.remove(oldIndex);
    if (aRegister.indexOfHardWareAccess(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aRegister.removeHardWareAccess(this);
      if (!wasRemoved)
      {
        registers.add(oldIndex,aRegister);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addRegisterAt(Registers aRegister, int index)
  {  
    boolean wasAdded = false;
    if(addRegister(aRegister))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRegisters()) { index = numberOfRegisters() - 1; }
      registers.remove(aRegister);
      registers.add(index, aRegister);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveRegisterAt(Registers aRegister, int index)
  {
    boolean wasAdded = false;
    if(registers.contains(aRegister))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfRegisters()) { index = numberOfRegisters() - 1; }
      registers.remove(aRegister);
      registers.add(index, aRegister);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addRegisterAt(aRegister, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<InterfaceforAgentExecManager> copyOfInterfaceforAgentExecManagers = new ArrayList<InterfaceforAgentExecManager>(interfaceforAgentExecManagers);
    interfaceforAgentExecManagers.clear();
    for(InterfaceforAgentExecManager aInterfaceforAgentExecManager : copyOfInterfaceforAgentExecManagers)
    {
      aInterfaceforAgentExecManager.removeHardWareAccess(this);
    }
    ArrayList<Registers> copyOfRegisters = new ArrayList<Registers>(registers);
    registers.clear();
    for(Registers aRegister : copyOfRegisters)
    {
      aRegister.removeHardWareAccess(this);
    }
  }

}