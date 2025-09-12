# Legado
Trabalho Avaliativo UC10-Git
### Membros do Projeto:
<p>Gabriel Oliveira, Larissa Neitzke, Lucas Schmidt e Lucca Fagundes.</p>

<p></p>

## Lista de Tarefas Realizadas:
<li>1. Foi feita atualização inicial do código de ambiente de trabalho de gerenciamento de uma farmácia e aprovado pull request da branch feature/detalhar-tarefa;</li>

<li>2. Criado método 'cadastrarTarefa' e aprovado pull request da branch feature/adicionar-tarefa;</li>

<li>3. Criado método 'excluirTarefa' e, após solucionar conflitos, foi aprovado pull request da branch feature/excluir-tarefa;</li>

<li>4. Foram criados os métodos 'detalharTarefas' e 'listarTarefas' e enviado pul request. Entretanto, apresentou conflitos que precisaram ser resolvidos antes de aprovar 'merge';</li>

<li>5. Foi respondido o questionário do projeto e entregue o link do repositório ao professor.</li>

<p></p>

## Questionário:
### <div>Como o uso de branches ajudou na organização do trabalho do grupo?</div>
<p>O uso de branches ajudou a acompanhar o que cada membro do grupo fez e assim entender em qual estágio o projeto se encontrava.
Além disso, as branches mostraram de forma mais prática como acessar um projeto em grupo sem a necessidade de ficar compartilhando arquivos e baixando arquivos após cada atualização, pois se há alguma alteração, haverá o aviso de conflito.</p> 

### <div>Descrevam o conflito que ocorreu. Onde ele aconteceu e como vocês o resolveram?</div>
<p>Foi feito 'merge' da branch feature/adicionar-tarefa pois já estava atualizada e já havia sido testada. Quando foi feito comando 'git pull origin main' da branch feature/excluir-tarefa foi gerado um conflito pois a versão do código da branch feature/excluir-tarefa estava desatualizada em relação a branch main. A solução encontrada foi juntar os dados contidos na versão atualizada da branch feature/adicionar-tarefa incluindo o método 'excluirTarefa' da branch feature/excluir-tarefa.
O mesmo conflito ocorreu quando foi feito 'merge' da branch feature/detalhar-tarefa.</p>

### <div>Qual a importância de trabalhar com commits pequenos e bem descritos nesse cenário?</div>
<p>É importante ser feito commits por partes e detalhando o que foi feito para que eventual conflito seja mais facilmente identificado e corrigido. Ainda, se torna mais fácil verificar o andamento do projeto e o tempo que levou para concluir cada etapa/demanda do projeto.</p>