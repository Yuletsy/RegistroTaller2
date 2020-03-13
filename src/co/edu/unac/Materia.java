package co.edu.unac;

public class Materia {

	private Estudiante estudiante;
	private Double nota;

	public Materia() {

	}

	public Materia(Estudiante estudiante, Double nota) throws ValueException {
		if ((nota >= 0) && (nota <= 5)) {
			this.estudiante = estudiante;
			this.nota = nota;
		} else {
			throw new ValueException("ESTA NOTA NO ES VALIDA");
		}

	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
