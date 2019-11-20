package negocio.entidades;

import negocio.contratos.ServicoAbstrato;

public class ServicoAbstratoCompleto extends ServicoAbstrato {
    public ServicoAbstratoCompleto(String horaAgendada, Cliente cliente, PetCliente pet) {
        super(horaAgendada, cliente, pet);
        this.preco = 50;
        this.concluido = false;
    }

}
