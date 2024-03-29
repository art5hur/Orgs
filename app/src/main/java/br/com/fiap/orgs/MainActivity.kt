package carreiras.com.github.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import carreiras.com.github.orgs.R
import carreiras.com.github.orgs.model.Produto
import carreiras.com.github.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

/**
 * Classe MainActivity representa a classe principal do app.
 * Ela herda de ComponentActivity, que é uma classe fornecida pelo framework Android Jetpack.
 * Esta atividade exibe uma lista de produtos em um RecyclerView.
 */
class MainActivity : Activity() {

    /**
     * Método onCreate é chamado quando a atividade é criada. É sobrescrito o método onCreate(),
     * que é um método de ciclo de vidade uma atividade no Android.
     * Inicializa a interface do usuário e configura o RecyclerView para exibir a lista de produtos.

    O Bundle é usado para armazenar e passar dados entre componentes do Android,
    como atividades (Activity), fragmentos (Fragment), serviços (Service), etc.
    O Bundle é frequentemente utilizado para transferir informações entre diferentes partes
    do aplicativo ou entre diferentes atividades.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = listOf(
                Produto("Teste 0", "Teste Descrição 0", BigDecimal("19.90")),
                Produto("Teste 1", "Teste Descrição 1", BigDecimal("29.90")),
                Produto("Teste 2", "Teste Descrição 2", BigDecimal("39.90")),
            )
        )
        // Pode ser configurado no layout
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}