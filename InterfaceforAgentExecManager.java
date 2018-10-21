/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4295.41a59b8ce modeling language!*/


import java.util.*;

// line 82 "model.ump"
// line 189 "model.ump"
public class InterfaceforAgentExecManager
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //InterfaceforAgentExecManager Associations
  private List<MemoryAccess> memoryAccesses;
  private List<Function> functions;
  private List<HardWareAccess> hardWareAccesses;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public InterfaceforAgentExecManager()
  {
    memoryAccesses = new ArrayList<MemoryAccess>();
    functions = new ArrayList<Function>();
    hardWareAccesses = new ArrayList<HardWareAccess>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public MemoryAccess getMemoryAccess(int index)
  {
    MemoryAccess aMemoryAccess = memoryAccesses.get(index);
    return aMemoryAccess;
  }

  public List<MemoryAccess> getMemoryAccesses()
  {
    List<MemoryAccess> newMemoryAccesses = Collections.unmodifiableList(memoryAccesses);
    return newMemoryAccesses;
  }

  public int numberOfMemoryAccesses()
  {
    int number = memoryAccesses.size();
    return number;
  }

  public boolean hasMemoryAccesses()
  {
    boolean has = memoryAccesses.size() > 0;
    return has;
  }

  public int indexOfMemoryAccess(MemoryAccess aMemoryAccess)
  {
    int index = memoryAccesses.indexOf(aMemoryAccess);
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
  public HardWareAccess getHardWareAccess(int index)
  {
    HardWareAccess aHardWareAccess = hardWareAccesses.get(index);
    return aHardWareAccess;
  }

  public List<HardWareAccess> getHardWareAccesses()
  {
    List<HardWareAccess> newHardWareAccesses = Collections.unmodifiableList(hardWareAccesses);
    return newHardWareAccesses;
  }

  public int numberOfHardWareAccesses()
  {
    int number = hardWareAccesses.size();
    return number;
  }

  public boolean hasHardWareAccesses()
  {
    boolean has = hardWareAccesses.size() > 0;
    return has;
  }

  public int indexOfHardWareAccess(HardWareAccess aHardWareAccess)
  {
    int index = hardWareAccesses.indexOf(aHardWareAccess);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfMemoryAccesses()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addMemoryAccess(MemoryAccess aMemoryAccess)
  {
    boolean wasAdded = false;
    if (memoryAccesses.contains(aMemoryAccess)) { return false; }
    memoryAccesses.add(aMemoryAccess);
    if (aMemoryAccess.indexOfInterfaceforAgentExecManager(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aMemoryAccess.addInterfaceforAgentExecManager(this);
      if (!wasAdded)
      {
        memoryAccesses.remove(aMemoryAccess);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeMemoryAccess(MemoryAccess aMemoryAccess)
  {
    boolean wasRemoved = false;
    if (!memoryAccesses.contains(aMemoryAccess))
    {
      return wasRemoved;
    }

    int oldIndex = memoryAccesses.indexOf(aMemoryAccess);
    memoryAccesses.remove(oldIndex);
    if (aMemoryAccess.indexOfInterfaceforAgentExecManager(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aMemoryAccess.removeInterfaceforAgentExecManager(this);
      if (!wasRemoved)
      {
        memoryAccesses.add(oldIndex,aMemoryAccess);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addMemoryAccessAt(MemoryAccess aMemoryAccess, int index)
  {  
    boolean wasAdded = false;
    if(addMemoryAccess(aMemoryAccess))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMemoryAccesses()) { index = numberOfMemoryAccesses() - 1; }
      memoryAccesses.remove(aMemoryAccess);
      memoryAccesses.add(index, aMemoryAccess);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveMemoryAccessAt(MemoryAccess aMemoryAccess, int index)
  {
    boolean wasAdded = false;
    if(memoryAccesses.contains(aMemoryAccess))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfMemoryAccesses()) { index = numberOfMemoryAccesses() - 1; }
      memoryAccesses.remove(aMemoryAccess);
      memoryAccesses.add(index, aMemoryAccess);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addMemoryAccessAt(aMemoryAccess, index);
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
    if (aFunction.indexOfInterfaceforAgentExecManager(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aFunction.addInterfaceforAgentExecManager(this);
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
    if (aFunction.indexOfInterfaceforAgentExecManager(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aFunction.removeInterfaceforAgentExecManager(this);
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
  public static int minimumNumberOfHardWareAccesses()
  {
    return 0;
  }
  /* Code from template association_AddManyToManyMethod */
  public boolean addHardWareAccess(HardWareAccess aHardWareAccess)
  {
    boolean wasAdded = false;
    if (hardWareAccesses.contains(aHardWareAccess)) { return false; }
    hardWareAccesses.add(aHardWareAccess);
    if (aHardWareAccess.indexOfInterfaceforAgentExecManager(this) != -1)
    {
      wasAdded = true;
    }
    else
    {
      wasAdded = aHardWareAccess.addInterfaceforAgentExecManager(this);
      if (!wasAdded)
      {
        hardWareAccesses.remove(aHardWareAccess);
      }
    }
    return wasAdded;
  }
  /* Code from template association_RemoveMany */
  public boolean removeHardWareAccess(HardWareAccess aHardWareAccess)
  {
    boolean wasRemoved = false;
    if (!hardWareAccesses.contains(aHardWareAccess))
    {
      return wasRemoved;
    }

    int oldIndex = hardWareAccesses.indexOf(aHardWareAccess);
    hardWareAccesses.remove(oldIndex);
    if (aHardWareAccess.indexOfInterfaceforAgentExecManager(this) == -1)
    {
      wasRemoved = true;
    }
    else
    {
      wasRemoved = aHardWareAccess.removeInterfaceforAgentExecManager(this);
      if (!wasRemoved)
      {
        hardWareAccesses.add(oldIndex,aHardWareAccess);
      }
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addHardWareAccessAt(HardWareAccess aHardWareAccess, int index)
  {  
    boolean wasAdded = false;
    if(addHardWareAccess(aHardWareAccess))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHardWareAccesses()) { index = numberOfHardWareAccesses() - 1; }
      hardWareAccesses.remove(aHardWareAccess);
      hardWareAccesses.add(index, aHardWareAccess);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHardWareAccessAt(HardWareAccess aHardWareAccess, int index)
  {
    boolean wasAdded = false;
    if(hardWareAccesses.contains(aHardWareAccess))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHardWareAccesses()) { index = numberOfHardWareAccesses() - 1; }
      hardWareAccesses.remove(aHardWareAccess);
      hardWareAccesses.add(index, aHardWareAccess);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHardWareAccessAt(aHardWareAccess, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    ArrayList<MemoryAccess> copyOfMemoryAccesses = new ArrayList<MemoryAccess>(memoryAccesses);
    memoryAccesses.clear();
    for(MemoryAccess aMemoryAccess : copyOfMemoryAccesses)
    {
      aMemoryAccess.removeInterfaceforAgentExecManager(this);
    }
    ArrayList<Function> copyOfFunctions = new ArrayList<Function>(functions);
    functions.clear();
    for(Function aFunction : copyOfFunctions)
    {
      aFunction.removeInterfaceforAgentExecManager(this);
    }
    ArrayList<HardWareAccess> copyOfHardWareAccesses = new ArrayList<HardWareAccess>(hardWareAccesses);
    hardWareAccesses.clear();
    for(HardWareAccess aHardWareAccess : copyOfHardWareAccesses)
    {
      aHardWareAccess.removeInterfaceforAgentExecManager(this);
    }
  }

}