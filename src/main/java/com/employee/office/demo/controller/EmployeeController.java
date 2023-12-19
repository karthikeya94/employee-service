
@RestController
@RequestMapping("/api")
public class EmployeeController{
    @Autowired
    private EmployeeRepo empRepo;
    @Autowired
    private OfficeRepo officeRepo;
    @Autowired
    private Environment environment;

    @PostMapping("/employees")
    public ResponseEntity<EmployeeEntity> addEmployee(@RequestBody EmployeeEntity entity){
        return new ResponseEntity<>(empRepo.save(entity),HttpStatus.CREATED);
    }

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeEntity>> findEmp(){
        List<EmployeeEntity> findAll = empRepo.findAll();
        return new ResponseEntity<>(findAll,HttpStatus.OK);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<List<EmployeeEntity>> findEmployee(@PathVariable Integer id){
        Optional<EmployeeEntity> find = empRepo.findById(id);
        if(find.isPresent()){
            return new ResponseEntity<>(find,HttpStatus.OK);
        }else{
            throw new EmployeeException("001","no emp foud with id "+id);
        }
        
    }

}