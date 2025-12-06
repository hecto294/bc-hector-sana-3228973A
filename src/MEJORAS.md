# Mejoras - Semana 03

## Encapsulación Aplicada

### Clase: Patient
- Atributos encapsulados: name, idNumber, age, hasMedicalHistory, lastConsultationCost
- Validaciones agregadas:
    - name y idNumber no pueden ser nulos o vacíos.
    - age debe estar entre 0 y 120.
    - lastConsultationCost no puede ser negativo.
- Métodos auxiliares privados:
    - isValidString()
    - isValidAge()

### Clase: EyeExam
- Atributos encapsulados: examDate, examType, examCost, completed, patient
- Validaciones agregadas:
    - examType no puede ser nulo o vacío.
    - examCost >= 0.
    - patient no puede ser nulo.
    - examDate validado como string no vacío (puede ampliarse a validación YYYY-MM-DD).
- Métodos auxiliares privados:
    - isValidString()
    - isValidDateString()

### Clase: Doctor
- Atributos encapsulados: name, specialty, licenseNumber
- Validaciones agregadas:
    - name, specialty y licenseNumber no nulos ni vacíos.
- Método auxiliar privado:
    - isValidString()

### Clase: Appointment
- Atributos encapsulados: patient, doctor, eyeExam, date
- Validaciones agregadas:
    - patient y doctor no nulos.
    - date no nulo ni vacío.
    - si se asigna un eyeExam, debe pertenecer al mismo patient de la cita.
- Métodos auxiliares privados:
    - isValidString()

### Clase: ClinicManager
- Atributos encapsulados: clinicName, appointments
- Validaciones agregadas:
    - clinicName no nulo ni vacío.
    - addAppointment valida null.
- Métodos auxiliares privados:
    - isValidString()

## Constructores Sobrecargados

### Patient
- Constructor completo: Patient(name, idNumber, age, hasMedicalHistory, lastConsultationCost)
- Constructor minimal: Patient(name, idNumber)
- Constructor convenience: Patient(name, age, idNumber)

### EyeExam
- Constructor completo: EyeExam(examDate, examType, examCost, patient)
- Constructor minimal: EyeExam(examType, patient)

### Doctor
- Constructor completo: Doctor(name, specialty, licenseNumber)
- Constructor minimal: Doctor(name, specialty)

### Appointment
- Constructor completo: Appointment(patient, doctor, eyeExam, date)
- Constructor minimal: Appointment(patient, doctor, date)

### ClinicManager
- Constructor: ClinicManager(clinicName)

## Beneficios Logrados
- Mejora de la seguridad de datos: las propiedades solo se modifican mediante setters validados.
- Consistencia entre objetos relacionados (por ejemplo, Appointment y EyeExam).
- Facilita pruebas unitarias al exponer comportamientos bien definidos y validaciones claras.
- Preparación para ampliar el sistema (persistencia, UI, servicios) sin romper invariantes.
